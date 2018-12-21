package com.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.pojo.CountUnity;
import com.shop.pojo.Specification;
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
		model.addAttribute("countUnitys",BaseData.getCountUnitys());
		model.addAttribute("specifications",BaseData.getSpecifications());
		
		System.out.println(BaseServiceImpl.baseMapper.selectCountUnit().size());
		return "addGoods";
	}
}
