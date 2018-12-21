package com.shop.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.shop.pojo.Specification;

@Mapper
public interface SpecificationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Specification record);

    int insertSelective(Specification record);

    Specification selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Specification record);

    int updateByPrimaryKey(Specification record);
}