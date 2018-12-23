package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.ShopMapper;
import com.shop.pojo.Shop;
import com.shop.service.ShopService;
import com.shop.tools.PageTool;

@Service("shopService")
public class ShopServiceImpl implements ShopService{

	 
	
	@Autowired
	ShopMapper shopMapper;
	
	private PageTool pageTool;
	
	@Override
	public List<Shop> selectAllShop() {
		if(pageTool == null) {
			 pageTool = new PageTool();
			 pageTool.setTotalCount(shopMapper.getCount());
			 pageTool.setCurrentPageNo(0);
			 System.out.println("初始化了");
		}
		
		return shopMapper.selectShopArray(pageTool.getCurrentPageNo(),pageTool.getPageSize());
	}
	
}
