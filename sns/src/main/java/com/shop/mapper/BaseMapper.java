package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.shop.pojo.CountUnity;
import com.shop.pojo.Lib;
import com.shop.pojo.Specification;

/**
 * 基础映射  储存一些基础模型
 * @author Administrator
 *
 */

@Mapper
public interface BaseMapper {
	
	/**
	 * 获得所有的计量单位
	 * @return 单位集合
	 */
	List<CountUnity> selectCountUnit();
	
	List<Specification> selectSpecifications();
	
	/**
	 * 获取所有仓库
	 * @return
	 */
	List<Lib> selectLibList();
	
}
