package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.BaseMapper;
import com.shop.pojo.CountUnity;
import com.shop.pojo.Lib;
import com.shop.service.BaseService;

@Service("baseService")
public class BaseServiceImpl implements BaseService{
	//@Autowired   自动添加不能用在静态类中  只能用在对象,所以这里在构造方法时设置该静态类
	public static BaseMapper baseMapper;
	
	@Autowired
    public BaseServiceImpl(BaseMapper baseMapper) {
		BaseServiceImpl.baseMapper = baseMapper;
    }

	/**
	 * 查询仓库信息
	 */
	public List<Lib> queryLibInfo() {
		return baseMapper.selectLibList();
	}

	/**
	 * 查询计量单位集合
	 */
	public List<CountUnity> queryCountUnitList() {
		return baseMapper.selectCountUnit();
	}
}
