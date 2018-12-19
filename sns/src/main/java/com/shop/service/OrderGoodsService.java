package com.shop.service;

import java.sql.SQLException;

import com.shop.pojo.document.OrderGoods;

public interface OrderGoodsService {
	OrderGoods selectById(Integer id);
	
	int seveOrderGoods(OrderGoods orderGoods) throws SQLException; 
}
