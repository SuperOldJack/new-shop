package com.shop.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shop.mapper.document.GoodsDocumentMapper;
import com.shop.mapper.document.OrderGoodsMapper;
import com.shop.pojo.GoodsInfo;
import com.shop.pojo.Worker;
import com.shop.pojo.document.GoodsSummary;
import com.shop.pojo.document.IDoc;
import com.shop.pojo.document.OrderGoods;
import com.shop.pojo.info.DocTypeMap;
import com.shop.service.GoodsInfoService;
import com.shop.service.OrderGoodsService;
import com.shop.service.templet.SeveDocTemplet;

@Service("orderGoodsService")
public class OrderGoodsServiceImpl extends SeveDocTemplet implements OrderGoodsService{

	@Autowired
	OrderGoodsMapper orderGoodsMapper;
	
	
	@Override
	public OrderGoods selectById(Integer id) {
		
		return orderGoodsMapper.selectByPrimaryKey(id);
	}

	public int seveOrderGoods(OrderGoods orderGoods,List<GoodsInfo> goodsInfo) throws SQLException {
		return seveDocInfo(orderGoods,goodsInfo);
	}
	
	@Override
	protected int addDocTypeInfo(IDoc doc) {
		OrderGoods orederGoods = OrderGoods.class.cast(doc);
		int orderResult = orderGoodsMapper.insertSelective(orederGoods);
		return orderResult;
	};
	

	@Override
	public List<OrderGoods> selectOrderGoodsAll() {
		
		return orderGoodsMapper.selectOrderGoodsAll();
	}

	@Override
	public List<GoodsSummary> getGoodsDetailAll() {
		
		return orderGoodsMapper.getGoodsDetailAll();
	}

	
	
	
}
