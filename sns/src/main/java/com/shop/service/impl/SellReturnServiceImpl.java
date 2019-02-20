package com.shop.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.document.SellReturnMapper;
import com.shop.pojo.GoodsInfo;
import com.shop.pojo.document.IDoc;
import com.shop.pojo.document.SellReturn;
import com.shop.service.SellReturnService;
import com.shop.service.templet.SeveDocTemplet;

@Service("sellReturnService")
public class SellReturnServiceImpl extends SeveDocTemplet implements SellReturnService{

	@Autowired
	SellReturnMapper sellReturnMapper;
	
	@Override
	public SellReturn selectByPrimaryKey(Integer id) {
		return sellReturnMapper.selectByPrimaryKey(id);
	}

	@Override
	protected int addDocTypeInfo(IDoc doc) {
		SellReturn sr = SellReturn.class.cast(doc);
		int result = sellReturnMapper.insertSelective(sr);
		return result;
	}

	@Override
	public int seveReturnSell(SellReturn sr, List<GoodsInfo> goodsInfos) throws SQLException {
		
		return seveDocInfo(sr, goodsInfos);
	}

}
