package com.shop.mapper.document;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.shop.pojo.document.Outputlib;

@Mapper
public interface OutputlibMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Outputlib record);

    int insertSelective(Outputlib record);

    Outputlib selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Outputlib record);

    int updateByPrimaryKey(Outputlib record);
    
    List<Outputlib> selectAll();
    
    Outputlib selectOutputlibByCode(String code);
}