package com.shop.mapper;

import com.shop.pojo.OutLibAndUse;

public interface OutLibAndUseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OutLibAndUse record);

    int insertSelective(OutLibAndUse record);

    OutLibAndUse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OutLibAndUse record);

    int updateByPrimaryKey(OutLibAndUse record);
}