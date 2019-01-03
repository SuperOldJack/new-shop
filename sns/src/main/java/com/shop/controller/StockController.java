package com.shop.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.node.JSPMapper;
import com.shop.pojo.GoodsInfo;
import com.shop.pojo.document.Inputlib;
import com.shop.pojo.document.Outputlib;
import com.shop.pojo.info.DocTypeMap;
import com.shop.pojo.info.FullGoodsInfoListble;
import com.shop.service.InputLibService;
import com.shop.service.OutputlibService;
import com.shop.tools.CodeMake;

@Controller
@RequestMapping("/stock")
@DependsOn("theCentralController")
public class StockController {
	public StockController() {
		//向中央控制器添加此控制器
		TheCentralController.getCentralController().addController(this);
	}
	private final static String inputLibType = "RK"; 
	private final static String outLibType = "CK"; 

	//入库code
	private CodeMake rkcode = new CodeMake(inputLibType);
	
	private CodeMake ckcode = new CodeMake(outLibType);
	
	@Autowired
	InputLibService inputLibService; 
	
	@Autowired 
	OutputlibService outputlibService;
	
	
	/**
	 * 新增入库表
	 * @return
	 */
	@RequestMapping("/addInputLib")
	public synchronized String addInputLib(Inputlib inputlib,Integer[] shopId,Integer[] shopUnit,Integer[] shopSpecification,BigDecimal[] goodsPrice,Integer[] goodsCount) {
		
			
			String documentCode = inputlib.getGoodsDocument().getCode();
			inputlib.getGoodsDocument().setDocumentType(DocTypeMap.getType(inputLibType));
			try {

				//添加货品信息
				List<GoodsInfo> goodsInfos = FullGoodsInfoListble.fullInfoList(documentCode,shopId,shopUnit,shopSpecification,goodsPrice,goodsCount);
				
				//添加入库
				int result = inputLibService.seveInputLib(inputlib,goodsInfos);
				
				if(result > 0) {
					
				}
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("出现异常");
				return "error"; 
			}

		
		return null;
	}
	
	/**
	 * 新增出库表
	 * @return
	 */
	@RequestMapping("/addOutputLib")
	public synchronized String addOutputLib(Outputlib outlib,Integer[] shopId,Integer[] shopUnit,Integer[] shopSpecification,BigDecimal[] goodsPrice,Integer[] goodsCount) {
		
			
			String documentCode = outlib.getGoodsDocument().getCode();
			outlib.getGoodsDocument().setDocumentType(DocTypeMap.getType(outLibType));
			try {

				//添加货品信息
				List<GoodsInfo> goodsInfos = FullGoodsInfoListble.fullInfoList(documentCode,shopId,shopUnit,shopSpecification,goodsPrice,goodsCount);
				
				//添加入库
				int result = outputlibService.seveOutLib(outlib,goodsInfos);
				
				if(result > 0) {
					
				}
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("出现异常");
				return "error"; 
			}

		
		return null;
	}
	
	
	
	@ResponseBody
	@RequestMapping("/showInLib")
	@JSPMapper("stock/findInputLib")
	public List<Inputlib> showInLib() {
		List<Inputlib> lib = inputLibService.selectInLib();
		return lib;
	}
	
	@ResponseBody
	@RequestMapping("/showOutLib")
	@JSPMapper("stock/findOutputLib")
	public List<Outputlib> showOutLib() {
		List<Outputlib> lib = outputlibService.selectOutLib();
		return lib;
	}
	
	
	/**
	 * 获得入库单编码
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getNowInLibCode")
	public String getNowInLibCode() {
		return rkcode.getCode();
	}
	
	/**
	 * 获得出库单编码
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getNowOutLibCode")
	public String getNowOutLibCode() {
		return ckcode.getCode();
	}
	
}
