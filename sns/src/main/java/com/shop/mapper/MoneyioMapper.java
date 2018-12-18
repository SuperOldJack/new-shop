package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.shop.pojo.Moneyio;
import com.shop.pojo.VipInfo;

/**
 * 收支表
 * @author Administrator
 *
 */
@Mapper
public interface MoneyioMapper {
	
	/*增删改*/
	
    int deleteByPrimaryKey(Integer id);

    int insertSelective(Moneyio record);
    
    int updateByPrimaryKeySelective(Moneyio record);
    
    /*查询*/
    
    Moneyio selectByID(Integer id);
    
    /**
     * 关键字查询
     * @param keyword 关键字
     * @param ioType  收支类型
     * @return 收支表集合
     */
    List<Moneyio> selectByKeyword(String keyword,int ioType);
    
    /**
     * 单号查询
     * @param code 单号
     * @return 收支单
     */
    Moneyio selectByCode(String code);
    
    
    VipInfo equeryVip(String code);
    
}