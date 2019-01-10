package com.shop.service.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.document.OrderGoodsMapper;
import com.shop.pojo.GoodsInfo;
import com.shop.pojo.document.ClientSummary;
import com.shop.pojo.document.GoodsSummary;
import com.shop.pojo.document.IDoc;
import com.shop.pojo.document.OrderGoods;
import com.shop.service.OrderGoodsService;
import com.shop.service.templet.TPISerTemplet;
import com.shop.service.templet.SeveDocTemplet;
import com.shop.service.templet.TPISerTemplet;
import com.shop.tools.FindFunction;
import com.shop.tools.PageData;

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
	public PageData<OrderGoods> getOrderGoodsPage(Map<String,Object> map) {

		TPISerTemplet<OrderGoods> pageSerTemplet = new TPISerTemplet<OrderGoods>(orderGoodsMapper::selectByPage,orderGoodsMapper::getOrderCount);

		PageData<OrderGoods> createPageData = pageSerTemplet.createPageData(map);
		return createPageData;

	}

	@Override
	public PageData<GoodsSummary> getGoodsDetailAll(Map<String,Object> map) {
		
		TPISerTemplet<GoodsSummary> pageSerTemplet = new TPISerTemplet<GoodsSummary>(orderGoodsMapper::getGoodsDetailByPage,orderGoodsMapper::getGoodsDetailCount);

		PageData<GoodsSummary> createPageData = pageSerTemplet.createPageData(map);

		return createPageData;
	}

	@Override
	public PageData<ClientSummary> getUserSellSumByPage(Map<String,Object> map) {

		//创建分页类
		TPISerTemplet<ClientSummary> pageSerTemplet = new TPISerTemplet<ClientSummary>(orderGoodsMapper::getUserSellSumByPage,orderGoodsMapper::getUserSellSumCount);

		PageData<ClientSummary> createPageData = pageSerTemplet.createPageData(map);
		return createPageData;
	}

	




}
