package com.shop.service;

import java.util.List;

import com.shop.pojo.CountUnity;
import com.shop.pojo.Lib;

public interface BaseService {

	List<Lib> queryLibInfo();
	
	List<CountUnity> queryCountUnitList();
}
