package com.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.pojo.VipInfo;
import com.shop.service.VipInfoService;

@Controller
public class IndexController {

	@Autowired
	VipInfoService vipInfoService;
	
	@RequestMapping("/login")
	public String login(Model model, VipInfo vip) {
		System.out.println(vip.getVipNumber());
		VipInfo vip2 = vipInfoService.selectByVipNumber(vip.getVipNumber());
		System.out.println(vip2.getVipNumber()+"\t"+vip2.getPassword());
		model.addAttribute("vip", vip);
		return "index";
	}
	
	public static void main(String[] args) {
		
	}
}
