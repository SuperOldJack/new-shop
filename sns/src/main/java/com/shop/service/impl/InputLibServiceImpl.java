package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shop.mapper.GoodsInfoMapper;
import com.shop.mapper.document.GoodsDocumentMapper;
import com.shop.mapper.document.InputlibMapper;
import com.shop.pojo.GoodsDocument;
import com.shop.pojo.GoodsInfo;
import com.shop.pojo.document.IDoc;
import com.shop.pojo.document.Inputlib;
import com.shop.service.InputLibService;
import com.shop.service.templet.SeveDocTemplet;

@Service("inputLibService")
public class InputLibServiceImpl extends SeveDocTemplet implements InputLibService{

	@Autowired
	public InputlibMapper inputlibMapper;
	
	@Autowired 
	public GoodsDocumentMapper goodsDocumentMapper;
	
	@Autowired
	public GoodsInfoMapper goodsInfoMapper;
	
	@Override
	@Transactional
	public int seveInputLib(  Inputlib inputlib,List<GoodsInfo> goodsInfo) {
		
		
		 
		return seveDocInfo(inputlib, goodsInfo);
	}

	@Override
	protected int addDocTypeInfo(IDoc doc) {
		Inputlib inputlib = (Inputlib)doc ;
		
		int libResult = inputlibMapper.insert(inputlib);
		return libResult;
	}

	@Override
	public List<Inputlib> selectInLib() {

		return inputlibMapper.selectInLib();
	}
	
}
