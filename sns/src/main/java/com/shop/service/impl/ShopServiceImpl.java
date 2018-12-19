package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.ShopMapper;
import com.shop.pojo.Shop;
import com.shop.service.ShopService;

@Service("shopService")
public class ShopServiceImpl implements ShopService{

	@Autowired
	ShopMapper shopMapper;
	
	@Override
	public List<Shop> selectAllShop() {
		return shopMapper.selectShopArray();
	}
	
}
