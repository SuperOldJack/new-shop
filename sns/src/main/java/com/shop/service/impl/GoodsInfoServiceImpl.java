package com.shop.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.GoodsInfoMapper;
import com.shop.pojo.GoodsInfo;
import com.shop.pojo.document.OrderGoods;
import com.shop.service.GoodsInfoService;
import com.shop.service.templet.TPISerTemplet;
import com.shop.tools.PageData;

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

	@Override
	public PageData<GoodsInfo> orderGoodsSelectByPage(Map<String,Object> map) {
		
		
		TPISerTemplet<GoodsInfo> pageSerTemplet = new TPISerTemplet<GoodsInfo>(goodsInfoMapper::orderGoodsSelectByPage,goodsInfoMapper::getCount);

		PageData<GoodsInfo> createPageData = pageSerTemplet.createPageData(map);
		
		return createPageData;
	}
	
	
	
}
