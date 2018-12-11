package com.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.service.BankService;

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
}
