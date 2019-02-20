package com.shop.service;

import java.util.List;

import com.shop.pojo.GoodsDocument;

/**
 * 单据相关
 * @author Administrator
 *
 */
public interface GoodsDocService {

	/**
	 * 根据单据类型查找相应的单据
	 * @param typeid
	 * @return
	 */
	List<GoodsDocument> queryDocByTypeId(Integer typeId);
	
	/**
	 * 获得该类型最后一个创建的单据编号
	 * @param type
	 * @return
	 */
	String getLastCodeByType(String type);
}
