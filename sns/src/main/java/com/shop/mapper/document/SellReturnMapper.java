package com.shop.mapper.document;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.shop.pojo.document.SellReturn;

@Mapper
public interface SellReturnMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SellReturn record);

    int insertSelective(SellReturn record);

    SellReturn selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SellReturn record);

    int updateByPrimaryKey(SellReturn record);
    
    
}

