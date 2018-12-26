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
import com.shop.pojo.document.Inputlib;
import com.shop.service.InputLibService;

@Service("inputLibService")
public class InputLibServiceImpl implements InputLibService{

	@Autowired
	public InputlibMapper inputlibMapper;
	
	@Autowired 
	public GoodsDocumentMapper goodsDocumentMapper;
	
	@Autowired
	public GoodsInfoMapper goodsInfoMapper;
	
	@Override
	@Transactional
	public int seveInputLib(  Inputlib inputlib,List<GoodsInfo> goodsInfo) {
		
		
		
		int documentResult =goodsDocumentMapper.insertSelective(inputlib.getGoodsDocument());
		int goodsResult = goodsInfoMapper.insertList(goodsInfo);
		int libResult =inputlibMapper.insert(inputlib);
		int result = (libResult > 0 && documentResult > 0 && goodsResult >0) ? 1 : 0;
		return result;
	}
	
}
