package com.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.shop.service.GoodsDocService;

@Controller
public class DocumentController {
	public DocumentController() {
		documentController = this;
	}
	
	@Autowired
	private GoodsDocService goodsDocService;
	
	public static DocumentController documentController;
	
	
	public int GetTodayCodeByType(String type) {
		String code = goodsDocService.getLastCodeByType(type);
		if(code != null) {
			int index = code.lastIndexOf("-")+1;
			code = code.substring(index);
			return Integer.parseInt(code);
		}else {
			return 0;
		}
	}
}
