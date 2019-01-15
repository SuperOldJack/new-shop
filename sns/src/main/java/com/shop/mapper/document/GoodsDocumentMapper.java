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
    
    GoodsDocument selectgoodsDocByCode(String code);
    
    /**
     * 根据单据类型查找相应的单据
     * @param 单据类型id
     * @return 单据集合
     */
    List<GoodsDocument> selectInputLibDocByTypeId(int typeId);
}