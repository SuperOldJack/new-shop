package com.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.GoodsInfoMapper;
import com.shop.pojo.GoodsInfo;
import com.shop.service.GoodsInfoService;

@Service("goodsInfoService")
public class GoodsInfoServiceImpl implements GoodsInfoService{

	@Autowired
	GoodsInfoMapper goodsInfoMapper;
	
	@Override
	public GoodsInfo selectById(Integer id) {
		
		return goodsInfoMapper.selectByPrimaryKey(id);
	}
	
}
