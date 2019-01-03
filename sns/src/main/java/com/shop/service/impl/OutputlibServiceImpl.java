package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.document.OutputlibMapper;
import com.shop.pojo.GoodsInfo;
import com.shop.pojo.document.IDoc;
import com.shop.pojo.document.Inputlib;
import com.shop.pojo.document.Outputlib;
import com.shop.service.InputLibService;
import com.shop.service.OutputlibService;
import com.shop.service.templet.SeveDocTemplet;

@Service("outputlibService")
public class OutputlibServiceImpl extends SeveDocTemplet implements OutputlibService{
	
	@Autowired
	OutputlibMapper outputlibMapper;
	
	@Override
	protected int addDocTypeInfo(IDoc doc) {
		Outputlib inputlib = (Outputlib)doc ;
		
		int libResult = outputlibMapper.insertSelective(inputlib);
		return libResult;
	}

	@Override
	public int seveOutLib(Outputlib outputlib, List<GoodsInfo> goodsInfos) {
		return seveDocInfo(outputlib, goodsInfos);
		 
	}

	@Override
	public List<Outputlib> selectOutLib() {
		return outputlibMapper.selectAll();
	}

}
