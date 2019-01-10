package com.shop.mapper.document;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.shop.pojo.document.ClientSummary;
import com.shop.pojo.document.GoodsSummary;
import com.shop.pojo.document.OrderGoods;

@Mapper
public interface OrderGoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderGoods record);

    int insertSelective(OrderGoods record);

    OrderGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderGoods record);

    int updateByPrimaryKey(OrderGoods record);
    
    //获得销售单总数
    int getOrderCount();
    
    //获得销售汇总单总数
    int getGoodsDetailCount();
    
    //获得用户销售汇总总数
    int getUserSellSumCount();
    
    List<OrderGoods> selectOrderGoodsAll();
    
    List<GoodsSummary> getGoodsDetailAll();
    
    List<ClientSummary> getUserSellSumByPage(Map<String,Object> map);
    
    List<OrderGoods> selectByPage(Map<String,Object> map);
    
    List<GoodsSummary> getGoodsDetailByPage(Map<String,Object> map);
}