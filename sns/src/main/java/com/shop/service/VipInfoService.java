package com.shop.service;

import com.shop.pojo.VipInfo;

public interface VipInfoService {

	VipInfo selectByVipNumber(String vipNumber);
	
	/**
	 * 添加vip
	 * @param vip
	 * @return
	 */
	int addVip(VipInfo vip);
}
