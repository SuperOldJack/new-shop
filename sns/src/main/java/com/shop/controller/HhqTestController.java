package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.pojo.VipInfo;
import com.shop.service.VipInfoService;

@Controller
public class HhqTestController {

	
	@RequestMapping("/index")
	public String goApp() {
		System.out.println("goIndex");
		return "test";
	}
	
	@RequestMapping("/addPurchaseOrder")
	public String go() {
		System.out.println("6666");
		return "purchase/addPurchaseOrder";
	}
	
	
	
	@RequestMapping(value="/home/{type}/{mid}",method=RequestMethod.GET)
	public String test(@PathVariable("type")String type,@PathVariable("mid")String mid) {
		System.out.println(type+"\t"+mid);
		return type+"/"+mid;
	}
	
	
	@RequestMapping("/htest")
	@ResponseBody
	public Object test() {
		System.out.println("test");
		return "test";
	}
	
	@RequestMapping("/webSocketT")
	public String test2() {
		return "/test/hhqTest";
	}
}
