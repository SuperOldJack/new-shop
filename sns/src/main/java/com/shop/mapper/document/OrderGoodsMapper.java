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
    
    //获得销售汇总单总数 --销售明细表
    int getGoodsDetailCount();
    
    //获得用户销售汇总总数
    int getUserSellSumCount(Map<String,Object> map);

    /**
     * 获得真实销售单总数         
     * @param map 筛选条件
     * @return 减去了退货数量的销售单总数
     */
    int selectROCount(Map<String,Object> map);
    
    List<OrderGoods> selectOrderGoodsAll();
    
    List<GoodsSummary> getGoodsDetailAll();
    
    List<ClientSummary> getUserSellSumByPage(Map<String,Object> map);
    
    List<OrderGoods> selectByPage(Map<String,Object> map);
    
    List<GoodsSummary> getGoodsDetailByPage(Map<String,Object> map);
    
    /**
     * 获得真实销售单
     * @param map 筛选条件
     * @return 减去退货数量后的销售单
     */
    List<OrderGoods> selectRealityOrder(Map<String,Object> map);
}