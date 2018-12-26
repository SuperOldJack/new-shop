package com.shop.mapper;

import com.shop.pojo.PayrecAndInLib;

public interface PayrecAndInLibMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PayrecAndInLib record);

    int insertSelective(PayrecAndInLib record);

    PayrecAndInLib selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayrecAndInLib record);

    int updateByPrimaryKey(PayrecAndInLib record);
}