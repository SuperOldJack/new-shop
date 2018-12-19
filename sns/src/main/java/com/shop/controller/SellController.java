package com.shop.controller;

import java.sql.SQLException;

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
		/*
		 * OrderGoods orderGoods = orderGoodsService.selectById(1);
		 * System.out.println(orderGoods.getCard_id());
		 * */
		return "addSell"; 
	}
	
	@RequestMapping("/orderGoodsAdd")
	public String orderGoodsAdd(OrderGoods orderGoods) {
		try {
			orderGoodsService.seveOrderGoods(orderGoods);
		} catch (SQLException e) {
			System.out.println("出现异常");
			return "error"; 
		}
		return "addSell"; 
	}
	
	
}
