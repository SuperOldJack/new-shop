package com.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.pojo.GoodsInfo;
import com.shop.pojo.Moneyio;
import com.shop.pojo.VipInfo;
import com.shop.pojo.document.SellReturn;
import com.shop.service.GoodsInfoService;
import com.shop.service.MoneyioService;
import com.shop.service.SellReturnService;

@Controller
@RequestMapping("/JackTest")
public class JackTestController {
	
	@Autowired
	SellReturnService sellReturnService; 

	@Autowired
	MoneyioService moneyioService;
	
	@Autowired
	GoodsInfoService  goodsInfoService;
	
	@RequestMapping("/sellReturnTest")
	public String sellReturnTest() {
		SellReturn sell = sellReturnService.selectByPrimaryKey(1);
		System.out.println(sell);
		return "jackUserTest";
	}
	
	@RequestMapping("/moneyioTest")
	public String moneyioTest() {
		VipInfo info = moneyioService.equeryVip("001");
		
		
		Moneyio moneyio = moneyioService.selectById(1);
		System.out.println(moneyio.getManageWork().getVip().getVip_code()+moneyio.getManageWork().getVip());
		return "jackUserTest";
	}
	
	
	@RequestMapping("/goodsTest")
	public String goodsTest() {
		 GoodsInfo selectById = goodsInfoService.selectById(1);
		 System.out.println(selectById);
		 return "/sell/addSell";
	}
	
	@RequestMapping("/sellDocument")
	public String sellDocument() {
		return "/sell/addSell";
	}
}
