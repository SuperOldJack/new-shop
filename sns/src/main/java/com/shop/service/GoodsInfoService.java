package com.shop.service;

import java.util.List;

import com.shop.pojo.GoodsInfo;

public interface GoodsInfoService {
	GoodsInfo selectById(Integer id);
	
	int insertGoodsInfo(List<GoodsInfo> goodsinfos);
}
