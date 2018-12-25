package com.shop.mapper;

import com.shop.pojo.InLibAndSup;

public interface InLibAndSupMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InLibAndSup record);

    int insertSelective(InLibAndSup record);

    InLibAndSup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InLibAndSup record);

    int updateByPrimaryKey(InLibAndSup record);
}