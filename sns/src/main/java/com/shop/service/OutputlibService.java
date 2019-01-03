package com.shop.service;

import java.util.List;

import com.shop.pojo.GoodsInfo;
import com.shop.pojo.document.Inputlib;
import com.shop.pojo.document.Outputlib;

public interface OutputlibService {
	/**
	 * 会同时添加 流水表和出库表两张表的内容
	 * @param goodsInfos 流水表对象
	 * @param inputlib 出库表对象
	 * @return
	 */
	int seveOutLib(Outputlib outputlib,List<GoodsInfo> goodsInfos);
	
	
	List<Outputlib> selectOutLib();
}
