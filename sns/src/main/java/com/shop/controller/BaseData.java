package com.shop.controller;

import java.util.List;

import com.shop.pojo.CountUnity;
import com.shop.pojo.DocumentType;
import com.shop.pojo.Specification;
import com.shop.service.impl.BaseServiceImpl;

/**
 * 基础数据  保存没有外键或者改动不大的基础数据
 * @author Administrator
 *
 */
public class BaseData {
	private static List<CountUnity> countUnitys;
	
	private static List<Specification> specifications;
	
	private static List<DocumentType> documentType; 

	
	
	public static List<DocumentType> getDocumentType() {
		if(documentType == null) {
			documentType = BaseServiceImpl.baseMapper.selectDocType();
		}
		
		return documentType;
	}

	public static void setDocumentType(List<DocumentType> documentType) {
		BaseData.documentType = documentType;
	}

	public static List<CountUnity> getCountUnitys() {
		if(countUnitys == null) {
			countUnitys = BaseServiceImpl.baseMapper.selectCountUnit();
		}
		
		return countUnitys;
	}
	
	public static List<Specification> getSpecifications() {
		if(specifications == null) {
			specifications = BaseServiceImpl.baseMapper.selectSpecifications();
		}
		
		return specifications;
	}
}	
