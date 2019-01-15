package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.document.GoodsDocumentMapper;
import com.shop.pojo.GoodsDocument;
import com.shop.service.GoodsDocService;

@Service("goodsDocService")
public class GoodsDocServiceImpl implements GoodsDocService {

	@Autowired
	private GoodsDocumentMapper goodsDocumentMapper;
	
	public List<GoodsDocument> queryDocByTypeId(Integer typeId) {
		return goodsDocumentMapper.selectInputLibDocByTypeId(typeId);
	}

}
