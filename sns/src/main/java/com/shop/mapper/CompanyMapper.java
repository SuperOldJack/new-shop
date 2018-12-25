package com.shop.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.shop.pojo.Company;

@Mapper
public interface CompanyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Company record);

    int insertSelective(Company record);

    Company selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);
    
    /**
     * 查询公司信息
     * @return
     */
    Company selectCompanyInfo();
}