package com.shop.mapper.document;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.shop.pojo.document.PayrecAndOutLib;

@Mapper
public interface PayrecAndOutLibMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PayrecAndOutLib record);

    int insertSelective(PayrecAndOutLib record);

    PayrecAndOutLib selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayrecAndOutLib record);

    int updateByPrimaryKey(PayrecAndOutLib record);
    
    List<PayrecAndOutLib> selectReceiptsDoc();
}