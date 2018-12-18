package com.shop.service;

import com.shop.pojo.Moneyio;
import com.shop.pojo.VipInfo;

public interface MoneyioService {
	Moneyio selectById(Integer id);
	
	VipInfo equeryVip(String code);
}
