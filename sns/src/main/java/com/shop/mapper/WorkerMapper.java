package com.shop.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.shop.pojo.Worker;

@Mapper
public interface WorkerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Worker record);

    int insertSelective(Worker record);

    Worker selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Worker record);

    int updateByPrimaryKey(Worker record);
}