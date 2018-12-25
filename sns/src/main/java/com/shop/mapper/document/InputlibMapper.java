package com.shop.mapper.document;

import com.shop.pojo.document.Inputlib;

public interface InputlibMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Inputlib record);

    int insertSelective(Inputlib record);

    Inputlib selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Inputlib record);

    int updateByPrimaryKey(Inputlib record);
}