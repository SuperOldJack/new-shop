package com.shop.pojo.info;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.shop.controller.BaseData;
import com.shop.pojo.DocumentType;

public class DocTypeMap {
	
	private DocTypeMap() {}
	
	private static Map<String, DocumentType> type ;
	
	
	
	public static DocumentType getType(String typeName) {
		synchronized (DocTypeMap.class) {
			if(type == null) {
				init();
			}
		}
		return type.get(typeName);
	}
	
	
	
	private static void init(){
		type = new HashMap<>();
		List<DocumentType> documentType = BaseData.getDocumentType();
		documentType.forEach((t)->{type.put(t.getAbbreviation(),t);});
		
	}
	
}
