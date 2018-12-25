package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PurchaseController {

	
	@RequestMapping("/openAddGoodsChildren")
	public String addPurchaseOpenChildren() {
		return "addGoods";	
	}
}
