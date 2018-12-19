package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HhqTestController {

	@RequestMapping("/index")
	public String goApp() {
		System.out.println("goIndex");
		return "index";
	}
	
	@RequestMapping("/addPurchaseOrder")
	public String go() {
		System.out.println("6666");
		return "purchase/addPurchaseOrder";
	}
}
