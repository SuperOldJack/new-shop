package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.pojo.VipInfo;
import com.shop.service.VipInfoService;

@Controller
@RequestMapping("/hhq")
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
	
	
	
	/*@RequestMapping(value="/home/{type}/{mid}",method=RequestMethod.GET)
	public String test(@PathVariable("type")String type,@PathVariable("mid")String mid) {
		System.out.println(type+"\t"+mid);
		return type+"/"+mid;
	}
	*/
	
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
	
	@RequestMapping("/goTest")
	public String goTest() {
		System.out.println("测试");
		return "test/gg";
	}
	
	@RequestMapping("/testSubmit")
	public String submit() {
		System.out.println("提交了");
		return "test/father";
	}
	
	@RequestMapping("/openPage")
	public String openPage() {
		System.out.println("打开子窗体");
		return "test/son";
	}
	
	@RequestMapping("/openNew")
	public String openNew() {
		System.out.println("子窗体打开新窗体");
		return "test/newPage";
	}
	
	@RequestMapping("/openFaPage")
	public String openGgPage() {
		System.out.println("打开一级子窗口");
		return "test/father";
	}
}
