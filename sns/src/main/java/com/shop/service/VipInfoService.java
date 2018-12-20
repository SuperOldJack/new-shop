package com.shop.service;

import com.shop.pojo.VipInfo;

public interface VipInfoService {

	VipInfo selectByVipNumber(String vipNumber);
}
