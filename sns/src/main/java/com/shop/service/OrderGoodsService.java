package com.shop.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.shop.pojo.GoodsInfo;
import com.shop.pojo.document.ClientSummary;
import com.shop.pojo.document.GoodsSummary;
import com.shop.pojo.document.OrderGoods;
import com.shop.tools.PageData;

public interface OrderGoodsService {
	OrderGoods selectById(Integer id);
	
	List<OrderGoods> selectOrderGoodsAll();
	
	int seveOrderGoods(OrderGoods orderGoods,List<GoodsInfo> goodsInfos) throws SQLException; 
	
	
	PageData<OrderGoods> getOrderGoodsPage(Map<String, Object> map);
	
	/**
	 * 查询用户销售明细
	 * @param map 条件映射
	 * @return
	 */
	PageData<ClientSummary> getUserSellSumByPage(Map<String, Object> map);

	PageData<GoodsSummary> getGoodsDetailAll(Map<String, Object> map);
	
	PageData<OrderGoods> selectRealityOrder(Map<String, Object> map);
}
