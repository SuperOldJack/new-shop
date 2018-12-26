package com.shop.mapper;

import com.shop.pojo.PayrecAndOutLib;

public interface PayrecAndOutLibMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PayrecAndOutLib record);

    int insertSelective(PayrecAndOutLib record);

    PayrecAndOutLib selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayrecAndOutLib record);

    int updateByPrimaryKey(PayrecAndOutLib record);
}