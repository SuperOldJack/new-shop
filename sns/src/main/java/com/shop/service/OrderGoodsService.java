package com.shop.service;

import java.sql.SQLException;
import java.util.List;

import com.shop.pojo.GoodsInfo;
import com.shop.pojo.document.GoodsSummary;
import com.shop.pojo.document.OrderGoods;
import com.shop.tools.IPageTool;
import com.shop.tools.PageTool;

public interface OrderGoodsService {
	OrderGoods selectById(Integer id);
	
	List<OrderGoods> selectOrderGoodsAll();
	
	int seveOrderGoods(OrderGoods orderGoods,List<GoodsInfo> goodsInfos) throws SQLException; 
	
	List<GoodsSummary> getGoodsDetailAll();
	
	List<OrderGoods> getOrderGoodsPage(int currentPageNo);
	
}
