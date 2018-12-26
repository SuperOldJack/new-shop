package com.shop.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.pojo.GoodsInfo;
import com.shop.pojo.document.GoodsSummary;
import com.shop.pojo.document.OrderGoods;
import com.shop.pojo.info.DocTypeMap;
import com.shop.pojo.info.FullGoodsInfoListble;
import com.shop.service.GoodsInfoService;
import com.shop.service.OrderGoodsService;
import com.shop.service.SellReturnService;
import com.shop.socket.OrderGoodsSocket;
import com.shop.tools.CodeMake;

@RequestMapping("/sellManage")
@Controller
public class SellController {
	
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
	public List<OrderGoods> showOrderGoods() {
		List<OrderGoods> selectOrderGoodsAll = orderGoodsService.selectOrderGoodsAll();
		return selectOrderGoodsAll;
	}
	
	/**
	 * 查询销售货品明细
	 * @return
	 */
	@RequestMapping("/orderGoodsSelect")
	@ResponseBody
	public List<GoodsInfo> orderGoodsSelect() {
		List<GoodsInfo> orderGoodsSelect = goodsInfoService.orderGoodsSelect();
		return orderGoodsSelect;
	}
	
	
	@RequestMapping("/goodsSummaryAll")
	@ResponseBody
	public List<GoodsSummary> goodsDetailAll() {
		List<GoodsSummary> goodsDetailAll = orderGoodsService.getGoodsDetailAll();
		return goodsDetailAll;
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
