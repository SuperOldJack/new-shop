package com.shop.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.shop.pojo.Payment;

@Mapper
public interface PaymentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Payment record);

    int insertSelective(Payment record);

    Payment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Payment record);

    int updateByPrimaryKey(Payment record);
}