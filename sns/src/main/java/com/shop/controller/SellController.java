package com.shop.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;import org.omg.CORBA.DomainManagerOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.node.JSPMapper;
import com.shop.pojo.GoodsDocument;
import com.shop.pojo.GoodsInfo;
import com.shop.pojo.document.ClientSummary;
import com.shop.pojo.document.GoodsSummary;
import com.shop.pojo.document.OrderGoods;
import com.shop.pojo.document.SellReturn;
import com.shop.pojo.info.DocTypeMap;
import com.shop.pojo.info.FullGoodsInfoListble;
import com.shop.service.GoodsDocService;
import com.shop.service.GoodsInfoService;
import com.shop.service.OrderGoodsService;
import com.shop.service.SellReturnService;
import com.shop.tools.CodeMake;
import com.shop.tools.PageData;

@RequestMapping("/sellManage")
@Controller
@DependsOn("theCentralController")//添加依赖,这表示该控制器会在其他控制器之后实例化
public class SellController {
	
	public SellController() {
		//向中央控制器添加此控制器
		TheCentralController.getCentralController().addController(this);
		
		
		
		//xsCode.setCode(DomainManagerOperations);
	}
	
	private final static String orderGoodsType = "XS";
	private final static String returnSellType = "XT";
	
	private CodeMake xsCode;
	protected CodeMake getXsCode() {
		if(xsCode == null) return CodeMake.initCodeMake(orderGoodsType);
		else return xsCode;
	}

	private CodeMake xtCode;
	protected CodeMake getXtCode() {
		if(xtCode == null) return CodeMake.initCodeMake(returnSellType);
		else return xtCode;
	}


	
	
	@Autowired
	private SellReturnService sellReturnService;//销售退款处理 
	
	@Autowired
	private OrderGoodsService orderGoodsService;//销售货品处理
	
	
	
	@Autowired
	private GoodsInfoService goodsInfoService;
	
	@RequestMapping("/queryGoodsInfo")
	@ResponseBody
	public List<GoodsInfo> xtGetOrderGoods(String code) {
		
		List<GoodsInfo> goodsInfo = goodsInfoService.queryGoodsInfoByCode(code); 
		return goodsInfo;
	}
	
	
	/**
	 * 获得销售单(计算退货情况后的数据)
	 * @param map
	 * @return
	 */
	@RequestMapping("/sellReturn")
	@ResponseBody
	@JSPMapper("sell/sellRturn")
	public PageData<OrderGoods> xtGetOrderGoods(Map<String,Object> map) {
		
		PageData<OrderGoods> selectRealityOrder = orderGoodsService.selectRealityOrder(map); 
		return selectRealityOrder;
	}
	
	@RequestMapping("/showOrderGoods")
	@ResponseBody
	@JSPMapper("sell/findSell")
	public PageData<OrderGoods> showOrderGoods(Map<String,Object> map) throws NumberFormatException{
		
		PageData<OrderGoods> orderGoodsPage = orderGoodsService.getOrderGoodsPage(map);
		return orderGoodsPage;
	}
	
	
	@RequestMapping("/goodsSummaryAll")
	@ResponseBody
	@JSPMapper("sell/sellSummary")
	public PageData<GoodsSummary> goodsDetailAll(Map<String,Object> map) throws NumberFormatException{
	
		PageData<GoodsSummary> goodsDetailAll = orderGoodsService.getGoodsDetailAll(map);
		return goodsDetailAll;
		
	}
	
	
	/**
	 * 查询销售货品明细
	 * @return
	 */
	@RequestMapping("/orderGoodsSelect")
	@ResponseBody
	@JSPMapper("sell/sellDetail")
	public PageData<GoodsInfo> orderGoodsSelect(Map<String,Object> map) throws NumberFormatException{
		
		
		
		PageData<GoodsInfo> orderGoodsSelect = goodsInfoService.orderGoodsSelectByPage(map);
		return orderGoodsSelect;
		
	}
	
	/**
	 * 查询用户销售明细
	 * @param page
	 * @return
	 * @throws NumberFormatException
	 */
	@RequestMapping("/clientSellSummary")
	@ResponseBody
	@JSPMapper("sell/CSellSummary")
	public PageData<ClientSummary> clientSellSummary(Map<String,Object> map) throws NumberFormatException{
		PageData<ClientSummary> orderGoodsSelect = orderGoodsService.getUserSellSumByPage(map);
		return orderGoodsSelect;
		
	}
	
	/**
	 * 退款单添加
	 */
	@RequestMapping("/orderGoodsReturn")
	public synchronized String addReturnSell(SellReturn sr,Integer[] shopId,Integer[] shopUnit,Integer[] shopSpecification,BigDecimal[] goodsPrice,Integer[] goodsCount) {
		String documentCode = getXtCode().getCode();
		
		GoodsDocument gd = sr.getGoodsDocument();
		gd.setComment(sr.getComment());
		gd.setCode(documentCode);
		gd.setDocumentType(DocTypeMap.getType(returnSellType));
		try {

			//添加货品信息
			List<GoodsInfo> goodsInfos = FullGoodsInfoListble.fullInfoList(documentCode,shopId,shopUnit,shopSpecification,goodsPrice,goodsCount);
			
			//添加退款单
			int result = sellReturnService.seveReturnSell(sr,goodsInfos);
			
			/*if(result > 0) {
				
				OrderGoodsSocket.sendDocumentCode(code.getCode());
			}*/
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("出现异常");
			return "error"; 
		}
		return "redirect:/goHome"; 
	}
	
	@RequestMapping("/orderGoodsAdd")
	public synchronized String orderGoodsAdd(OrderGoods orderGoods,Integer[] shopId,Integer[] shopUnit,Integer[] shopSpecification,BigDecimal[] goodsPrice,Integer[] goodsCount) {
		
		String documentCode = getXsCode().getCode();
		
		orderGoods.getGoodsDocument().setCode(documentCode);
		orderGoods.getGoodsDocument().setDocumentType(DocTypeMap.getType(orderGoodsType));
		try {

			//添加货品信息
			List<GoodsInfo> goodsInfos = FullGoodsInfoListble.fullInfoList(documentCode,shopId,shopUnit,shopSpecification,goodsPrice,goodsCount);
			
			//添加销售单
			int result = orderGoodsService.seveOrderGoods(orderGoods,goodsInfos);
			
			/*if(result > 0) {
				
				OrderGoodsSocket.sendDocumentCode(code.getCode());
			}*/
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("出现异常");
			return "error"; 
		}
		return "redirect:/goHome"; 
	}

	
	
	
	@Deprecated
	@ResponseBody
	@RequestMapping("/getNowSellOrderCode")
	public String getNowSellOrderCode() {
		return xsCode.getCode();
	}
	
	
	
}
