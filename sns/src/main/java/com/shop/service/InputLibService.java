package com.shop.service;

import java.util.List;

import com.shop.pojo.GoodsDocument;
import com.shop.pojo.GoodsInfo;
import com.shop.pojo.document.Inputlib;

/**
 * 入库表 --服务层
 * @author Administrator
 *
 */
public interface InputLibService {

	/**
	 * 会同时添加 流水表和入库表两张表的内容
	 * @param goodsInfos 流水表对象
	 * @param inputlib 入库表对象
	 * @return
	 */
	int seveInputLib( Inputlib inputlib,List<GoodsInfo> goodsInfos);
}
