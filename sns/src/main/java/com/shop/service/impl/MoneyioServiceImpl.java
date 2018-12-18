package com.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.MoneyioMapper;
import com.shop.pojo.Moneyio;
import com.shop.pojo.VipInfo;
import com.shop.service.MoneyioService;

@Service("moneyioService")
public class MoneyioServiceImpl implements MoneyioService{

	@Autowired
	MoneyioMapper moneyioMapper;
	
	@Override
	public Moneyio selectById(Integer id) {
		return moneyioMapper.selectByID(id);
	}

	@Override
	public VipInfo equeryVip(String code) {
		// TODO Auto-generated method stub
		return moneyioMapper.equeryVip(code);
	}

}
