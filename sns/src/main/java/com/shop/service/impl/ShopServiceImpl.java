package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.ShopMapper;
import com.shop.pojo.Shop;
import com.shop.service.ShopService;
import com.shop.tools.IPageTool;
import com.shop.tools.PageTool;

@Service("shopService")
public class ShopServiceImpl implements ShopService{



	@Autowired
	ShopMapper shopMapper;


	@Override
	public List<Shop> selectAllShop() {
		IPageTool pageTool = new PageTool(0,shopMapper.getCount());
		System.out.println("初始化了");

		return shopMapper.selectShopArray(pageTool.getCurrentPageNo(),pageTool.getPageSize());
	}

}
