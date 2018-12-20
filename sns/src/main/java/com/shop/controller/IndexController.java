package com.shop.controller;

import javax.servlet.http.HttpSession;

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
	
	@RequestMapping("/goHome")
	public String goHome(HttpSession session) {
		VipInfo vip = (VipInfo)session.getAttribute("vip");
		if(vip == null) {
			return "index";
		} else {
			System.out.println("goHome");
			return "home";
		}
	}
	
	@RequestMapping("/login")
	public String login(Model model, VipInfo vip,HttpSession session) {
		VipInfo vip2 = vipInfoService.selectByVipNumber(vip.getVipNumber());
		if(vip2 == null) {
			model.addAttribute("accountError", "账号不存在");
			return "index";
		}
		if(vip.getPassword().trim().equals(vip2.getPassword().trim())) {
			model.addAttribute("vip", vip2);
			session.putValue("vip", vip2);
			return "redirect:goHome";
		} else {
			model.addAttribute("pwdError", "密码错误");
			return "index";
		}
	}
	
	
}
