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
import com.shop.pojo.document.OrderGoods;
import com.shop.service.GoodsInfoService;
import com.shop.service.OrderGoodsService;

@Service("orderGoodsService")
public class OrderGoodsServiceImpl implements OrderGoodsService{

	@Autowired
	OrderGoodsMapper orderGoodsMapper;
	
	@Autowired
	GoodsDocumentMapper goodsDocumentMapper;
	
	@Autowired
	GoodsInfoService goodsInfoService;
	
	@Override
	public OrderGoods selectById(Integer id) {
		
		return orderGoodsMapper.selectByPrimaryKey(id);
	}

	@Transactional
	public int seveOrderGoods(OrderGoods orderGoods,List<GoodsInfo> goodsInfo) throws SQLException {
		//测试代码  --记得删除
		Worker testWorkernew = new Worker();
		testWorkernew.setId(1);
		orderGoods.getGoodsDocument().setCreateMan(testWorkernew);
		
		
		orderGoods.getGoodsDocument().setDocument_type(OrderGoods.type);
		int documentResult = goodsDocumentMapper.insertSelective(orderGoods.getGoodsDocument());
		int orderResult = orderGoodsMapper.insertSelective(orderGoods);
		int goodsInfoResult = goodsInfoService.insertGoodsInfo(goodsInfo);
		
		
		
		
		int result = (orderResult > 0 && documentResult > 0 && goodsInfoResult > 0) ? 1 : 0;
		if(result <= 0) throw new SQLException("sql处理错误 --未增加数据");
		return result;
	}

	@Override
	public List<OrderGoods> selectOrderGoodsAll() {
		
		return orderGoodsMapper.selectOrderGoodsAll();
	}

	@Override
	public List<GoodsSummary> getGoodsDetailAll() {
		
		return orderGoodsMapper.getGoodsDetailAll();
	};
	
	
}
