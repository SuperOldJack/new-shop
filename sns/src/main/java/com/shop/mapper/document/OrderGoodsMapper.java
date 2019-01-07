package com.shop.mapper.document;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.shop.pojo.document.GoodsSummary;
import com.shop.pojo.document.OrderGoods;
import com.shop.tools.IPageTool;

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
    
    int getGoodsDetailCount();
    
    List<OrderGoods> selectOrderGoodsAll();
    
    List<GoodsSummary> getGoodsDetailAll();
    
    List<OrderGoods> selectByPage(@Param("pageIndex")int pageIndex,@Param("pageSize")int pageSize);
    
    List<GoodsSummary> getGoodsDetailByPage(@Param("pageIndex")int pageIndex,@Param("pageSize")int pageSize);
}