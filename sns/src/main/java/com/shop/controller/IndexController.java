package com.shop.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.pojo.VipInfo;
import com.shop.service.VipInfoService;

@Controller
public class IndexController {

	@Autowired
	VipInfoService vipInfoService;
	
	
	/**
	 * 此方法的作用：
	 * 当主页开始加载时会访问此方法 如果上一次有请求有将目的地传入sesion,
	 * 那么就会在右边div中加载上次做的东西 如果没有就什么都不会发生
	 * @param session
	 * @return
	 */
	@RequestMapping("/getLast")
	@ResponseBody
	public Object getLast(HttpSession session) {
		Object attribute = session.getAttribute("last");
		return attribute;
	}
	
	@RequestMapping("/goHome")
	public String goHome(HttpSession session) {
		/*VipInfo vip = (VipInfo)session.getAttribute("vip");
		if(vip == null) {
			return "index";
		} else {
			return "home";
		}*/
		return "home";
	}
	
	@RequestMapping("/login")
	public String login(Model model, VipInfo vip,HttpSession session) {
		VipInfo vip2 = vipInfoService.selectByVipNumber(vip.getVip_number());
		System.out.println(vip2.getVip_number());
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
