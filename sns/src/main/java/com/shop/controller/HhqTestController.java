package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
	@RequestMapping(value="/test/{type}/{mid}",method=RequestMethod.GET)
	public String test(@PathVariable("type")String type,@PathVariable("mid")String mid) {
		System.out.println(type+"\t"+mid);
		return type+"/"+mid;
	}
}
