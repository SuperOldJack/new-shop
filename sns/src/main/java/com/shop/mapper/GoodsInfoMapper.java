package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.shop.pojo.GoodsInfo;

@Mapper
public interface GoodsInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(GoodsInfo record);

    int insertList(List<GoodsInfo> record);
    
    GoodsInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsInfo record);

    int updateByPrimaryKey(GoodsInfo record);
    
    
}