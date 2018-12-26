package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.shop.pojo.PayrecAndInLib;

@Mapper
public interface PayrecAndInLibMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PayrecAndInLib record);

    int insertSelective(PayrecAndInLib record);

    PayrecAndInLib selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayrecAndInLib record);

    int updateByPrimaryKey(PayrecAndInLib record);
    
    /**
     * 查询付款单信息
     * @return
     */
    List<PayrecAndInLib> selectPaymentDoc();
}