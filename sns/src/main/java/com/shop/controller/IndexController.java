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
		VipInfo vip2 = vipInfoService.selectByVipNumber(vip.getVipNumber());
		if(vip2.equals(null)) {
			model.addAttribute("errorInfo", "账号不存在");
			return "index";
		}
		if(vip.getPassword().trim().equals(vip2.getPassword().trim())) {
			model.addAttribute("vip", vip2);
			return "home";
		} else {
			model.addAttribute("errorInfo", "密码错误");
			return "index";
		}
	}
	
	public static void main(String[] args) {
		
	}
}
