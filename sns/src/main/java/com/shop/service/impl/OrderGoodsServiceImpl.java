package com.shop.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.document.OrderGoodsMapper;
import com.shop.pojo.GoodsInfo;
import com.shop.pojo.document.GoodsSummary;
import com.shop.pojo.document.IDoc;
import com.shop.pojo.document.OrderGoods;
import com.shop.service.OrderGoodsService;
import com.shop.service.templet.SeveDocTemplet;
import com.shop.tools.IPageTool;
import com.shop.tools.PageData;
import com.shop.tools.PageTool;

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
	public PageData<OrderGoods> getOrderGoodsPage(int currentPageNo) {
		int count = orderGoodsMapper.getOrderCount();
		PageData<OrderGoods> page = new PageData<OrderGoods>(currentPageNo,count);
		
		List<OrderGoods> selectByPage = orderGoodsMapper.selectByPage(page.getCurrentPageIndex(),page.getPageSize());
		page.setPageData(selectByPage);
		return page;
		
	}

	@Override
	public PageData<GoodsSummary> getGoodsDetailAll(int currentPageNo) {
		int count = orderGoodsMapper.getGoodsDetailCount();
		PageData<GoodsSummary> page = new PageData<GoodsSummary>(currentPageNo,count);

		List<GoodsSummary> selectByPage = orderGoodsMapper.getGoodsDetailByPage(page.getCurrentPageIndex(),page.getPageSize());
		page.setPageData(selectByPage);
		return page;
	}

	
	
	
}
