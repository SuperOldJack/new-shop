package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.shop.pojo.Shop;

@Mapper
public interface ShopMapper {
	
	@Select("select id, name, content from tb_shop limit #{pageIndex},#{pageSize}")
    List<Shop> selectShopArray(@Param("pageIndex") Integer pageIndex, @Param("pageSize") Integer pageSize);
	
	@Select("select count(1) from tb_shop")
	int getCount();
}