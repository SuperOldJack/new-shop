package com.shop.service;

import java.sql.SQLException;
import java.util.List;

import com.shop.pojo.GoodsInfo;
import com.shop.pojo.document.SellReturn;

public interface SellReturnService {
	SellReturn selectByPrimaryKey(Integer id);
	

	/**
	 * 保存销售退货单
	 * @param sr 销售退货单信息
	 * @param goodsInfos 商品信息
	 * @return 结果
	 * @throws SQLException
	 */
	int seveReturnSell(SellReturn sr,List<GoodsInfo> goodsInfos) throws SQLException; 
}
