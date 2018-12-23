package com.shop.service;

import java.sql.SQLException;
import java.util.List;

import com.shop.pojo.GoodsInfo;
import com.shop.pojo.document.GoodsDetail;
import com.shop.pojo.document.OrderGoods;

public interface OrderGoodsService {
	OrderGoods selectById(Integer id);
	
	List<OrderGoods> selectOrderGoodsAll();
	
	int seveOrderGoods(OrderGoods orderGoods,List<GoodsInfo> goodsInfos) throws SQLException; 
	
	List<GoodsDetail> getGoodsDetailAll();
}
