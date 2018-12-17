package com.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.document.SellReturnMapper;
import com.shop.pojo.document.SellReturn;
import com.shop.service.SellReturnService;

@Service("sellReturnService")
public class SellReturnServiceImpl implements SellReturnService{

	@Autowired
	SellReturnMapper sellReturnMapper;
	
	@Override
	public SellReturn selectByPrimaryKey(Integer id) {
		return sellReturnMapper.selectByPrimaryKey(id);
	}

}
