package com.shop.mapper.document;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.shop.pojo.document.Inputlib;

@Mapper
public interface InputlibMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Inputlib record);

    int insertSelective(Inputlib record);

    Inputlib selectByPrimaryKey(Integer id);

    List<Inputlib> selectInLib();
    
    int updateByPrimaryKeySelective(Inputlib record);

    int updateByPrimaryKey(Inputlib record);
}