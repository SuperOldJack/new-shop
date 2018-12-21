package com.shop.service.impl;

import java.util.List;

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

	@Override
	public int insertGoodsInfo(List<GoodsInfo> goodsinfos) {
		
		return goodsInfoMapper.insertList(goodsinfos);
	}

	@Override
	public List<GoodsInfo> orderGoodsSelect() {
		
		return goodsInfoMapper.orderGoodsSelect();
	}
	
	
	
}
