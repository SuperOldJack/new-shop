package com.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.document.OrderGoodsMapper;
import com.shop.pojo.document.OrderGoods;
import com.shop.service.OrderGoodsService;

@Service("orderGoodsService")
public class OrderGoodsServiceImpl implements OrderGoodsService{

	@Autowired
	OrderGoodsMapper orderGoodsMapper;
	
	@Override
	public OrderGoods selectById(Integer id) {
		
		return orderGoodsMapper.selectByPrimaryKey(id);
	}

}
