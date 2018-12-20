package com.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.VipInfoMapper;
import com.shop.pojo.VipInfo;
import com.shop.service.VipInfoService;

@Service("vipInfoService")
public class VipInfoServiceImpl implements VipInfoService {

	@Autowired
	VipInfoMapper vipInfoMapper;
	
	public VipInfo selectByVipNumber(String vipNumber) {
		return vipInfoMapper.selectByVipNumber(vipNumber);
	}


}
