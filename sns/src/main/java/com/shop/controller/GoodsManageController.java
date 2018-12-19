package com.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.service.ShopService;
import com.shop.service.impl.BaseServiceImpl;

@Controller
@RequestMapping("/goodsInfo")
public class GoodsManageController {
	@Autowired
	ShopService shopService;
	
	
	@RequestMapping("/addgoodsManage")
	public String goodsManage(Model model) {
		model.addAttribute("goodsInfo",shopService.selectAllShop());
		System.out.println(BaseServiceImpl.baseMapper.selectCountUnit().size());
		return "addGoods";
	}
}
