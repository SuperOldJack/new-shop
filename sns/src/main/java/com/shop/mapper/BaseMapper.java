package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.shop.pojo.CountUnity;

/**
 * 基础映射  储存一些基础模型
 * @author Administrator
 *
 */

@Mapper
public interface BaseMapper {
	List<CountUnity> selectCountUnit();
}
