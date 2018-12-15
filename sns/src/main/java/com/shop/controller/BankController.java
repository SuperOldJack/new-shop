package com.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.pojo.Bank;
import com.shop.service.BankService;

import net.sf.json.JSONArray;

@Controller
@RequestMapping("bank")
public class BankController {
	
	@Autowired
	BankService bankService;
	
	@RequestMapping("/test")
	public String test(Model model) {
		model.addAttribute("bankList", bankService.getBankList());
		return "/test";
	}
	
	@RequestMapping("/home")
	public String goHome() {
		System.out.println("goHome");
		return "home";
	}
	
	@ResponseBody
	@RequestMapping("/validate")
	public String ajaxTest(String id) {
		System.out.println(id);//{\"a\":1}aaaaa
		return "adadaadad";
	}
	
	@ResponseBody
	@RequestMapping("/getBankList")
	public Object getBank() {
		List<Bank> bankList = bankService.getBankList();
		JSONArray json = JSONArray.fromObject(bankList);
		return json;
	}
}
