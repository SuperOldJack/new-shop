package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.shop.pojo.Shop;

@Mapper
public interface ShopMapper {
	
	@Select("select id, name, content from tb_shop")
    List<Shop> selectShopArray();
}