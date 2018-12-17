package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HhqTestController {

	@RequestMapping("/app")
	public String goApp() {
		System.out.println("goApp");
		return "app";
	}
}
