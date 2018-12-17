package com.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.pojo.Moneyio;
import com.shop.service.MoneyioService;
import com.shop.service.SellReturnService;

@Controller
public class SellReturnController {
	
	@Autowired
	SellReturnService sellReturnService; 
	
	
	@RequestMapping("/sellReturnTest")
	public String sellReturnTest() {
		if(sellReturnService.selectByPrimaryKey(1) == null) System.out.println("OK"); 
		return "jackUserTest"; 
	}
	
	
}
