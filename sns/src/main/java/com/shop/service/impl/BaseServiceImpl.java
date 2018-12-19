package com.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.BaseMapper;
import com.shop.service.BaseService;

@Service("baseService")
public class BaseServiceImpl implements BaseService{
	//@Autowired   自动添加不能用在静态类中  只能用在对象,所以这里在构造方法时设置该静态类
	public static BaseMapper baseMapper;
	
	@Autowired
    public BaseServiceImpl(BaseMapper baseMapper) {
		BaseServiceImpl.baseMapper = baseMapper;
    }
}
