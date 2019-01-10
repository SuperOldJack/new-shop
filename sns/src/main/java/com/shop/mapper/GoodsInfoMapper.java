package com.shop.mapper;

import java.util.List;
import java.util.Map;

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
    
    //用于查询销售货品和销售退货货品
    List<GoodsInfo> orderGoodsSelect();
    
    List<GoodsInfo> orderGoodsSelectByPage(Map<String,Object> map);
    
    GoodsInfo selectGoodsByPrimaryKey(Integer id);
    
    int getCount();
    
    
}