package com.shop.service;

import java.util.List;
import java.util.Map;

import com.shop.pojo.GoodsInfo;
import com.shop.tools.PageData;

public interface GoodsInfoService {
	GoodsInfo selectById(Integer id);
	
	int insertGoodsInfo(List<GoodsInfo> goodsinfos);
	
	/**
	 * 查询货品信息 --销售退货和销售有关
	 */
	List<GoodsInfo> orderGoodsSelect();
	
	/**
	 * 查询销售货品明细
	 * @param map 条件映射
	 * @return
	 */
	PageData<GoodsInfo> orderGoodsSelectByPage(Map<String, Object> map);
}
