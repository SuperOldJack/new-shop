package com.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.pojo.Moneyio;
import com.shop.pojo.document.OrderGoods;
import com.shop.service.MoneyioService;
import com.shop.service.OrderGoodsService;
import com.shop.service.SellReturnService;

@RequestMapping("/sellManage")
@Controller
public class SellController {
	
	@Autowired
	SellReturnService sellReturnService;//销售退款处理 
	
	@Autowired
	OrderGoodsService orderGoodsService;//销售货品处理
	
	@RequestMapping("/sellReturnTest")
	public String sellReturnTest() {
		if(sellReturnService.selectByPrimaryKey(1) == null) System.out.println("OK"); 
		return "jackUserTest"; 
	}
	
	@RequestMapping("/orderGoodsTest")
	public String orderGoodsTest() {
		OrderGoods orderGoods = orderGoodsService.selectById(1);
		System.out.println(orderGoods.getCard_id());
		return "orderbill"; 
	}
	
	@RequestMapping("/orderGoodsAdd")
	public String orderGoodsAdd(OrderGoods orderGoods,String comment) {
		System.out.println(comment);
		//orderGoodsService.seveOrderGoods(orderGoods);
		System.out.println(orderGoods);
		return "orderbill"; 
	}
	
	
}
