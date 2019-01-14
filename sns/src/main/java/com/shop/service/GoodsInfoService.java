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
	
	PageData<GoodsInfo> orderGoodsSelectByPage(Map<String, Object> map);
	
	/**
	 * 根据单号查询货品信息
	 * @param code
	 * @return
	 */
	List<GoodsInfo> queryGoodsInfoByCode(String code);
	
}
