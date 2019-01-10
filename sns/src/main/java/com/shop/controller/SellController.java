package com.shop.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.node.JSPMapper;
import com.shop.pojo.GoodsInfo;
import com.shop.pojo.document.ClientSummary;
import com.shop.pojo.document.GoodsSummary;
import com.shop.pojo.document.OrderGoods;
import com.shop.pojo.info.DocTypeMap;
import com.shop.pojo.info.FullGoodsInfoListble;
import com.shop.service.GoodsInfoService;
import com.shop.service.OrderGoodsService;
import com.shop.service.SellReturnService;
import com.shop.socket.OrderGoodsSocket;
import com.shop.tools.CodeMake;
import com.shop.tools.PageData;

@RequestMapping("/sellManage")
@Controller
@DependsOn("theCentralController")//添加依赖,这表示该控制器会在其他控制器之后实例化
public class SellController {
	
	public SellController() {
		//向中央控制器添加此控制器
		TheCentralController.getCentralController().addController(this);
	}
	
	private final static String orderGoodsType = "XS";
	
	private CodeMake code = new CodeMake(orderGoodsType);
	
	@Autowired
	SellReturnService sellReturnService;//销售退款处理 
	
	@Autowired
	OrderGoodsService orderGoodsService;//销售货品处理
	
	
	@Autowired
	GoodsInfoService goodsInfoService;
	
	@RequestMapping("/sellReturnTest")
	public String sellReturnTest() {
		if(sellReturnService.selectByPrimaryKey(1) == null) System.out.println("OK"); 
		return "jackUserTest"; 
	}
	/*
	@RequestMapping("/orderGoodsTest")
	public String orderGoodsTest() {
		
		 * OrderGoods orderGoods = orderGoodsService.selectById(1);
		 * System.out.println(orderGoods.getCard_id());
		 * 
		return "/sell/addSell"; 
	}*/
	
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
	
	
	
	@RequestMapping("/orderGoodsAdd")
	public synchronized String orderGoodsAdd(OrderGoods orderGoods,Integer[] shopId,Integer[] shopUnit,Integer[] shopSpecification,BigDecimal[] goodsPrice,Integer[] goodsCount) {
		
		String documentCode = orderGoods.getGoodsDocument().getCode();
		orderGoods.getGoodsDocument().setDocumentType(DocTypeMap.getType(orderGoodsType));
		try {

			//添加货品信息
			List<GoodsInfo> goodsInfos = FullGoodsInfoListble.fullInfoList(documentCode,shopId,shopUnit,shopSpecification,goodsPrice,goodsCount);
			
			//添加销售单
			int result = orderGoodsService.seveOrderGoods(orderGoods,goodsInfos);
			
			if(result > 0) {
				
				OrderGoodsSocket.sendDocumentCode(code.getCode());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("出现异常");
			return "error"; 
		}
		return "redirect:/goHome"; 
	}

	@ResponseBody
	@RequestMapping("/getNowSellOrderCode")
	public String getNowSellOrderCode() {
		return code.getCode();
	}
	
	
	
}
