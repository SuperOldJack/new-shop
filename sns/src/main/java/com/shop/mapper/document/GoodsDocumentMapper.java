package com.shop.mapper.document;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.shop.pojo.GoodsDocument;

@Mapper
public interface GoodsDocumentMapper {
    int deleteByPrimaryKey(String code);

    int insert(GoodsDocument record);

    int insertSelective(GoodsDocument goodsDocument);

    GoodsDocument selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(GoodsDocument record);

    int updateByPrimaryKey(GoodsDocument record);
}