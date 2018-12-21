package com.shop.service;

import java.util.List;

import com.shop.pojo.GoodsInfo;

public interface GoodsInfoService {
	GoodsInfo selectById(Integer id);
	
	int insertGoodsInfo(List<GoodsInfo> goodsinfos);
	
	/**
	 * 查询货品信息 --销售退货和销售有关
	 */
	List<GoodsInfo> orderGoodsSelect();
}
