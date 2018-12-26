package com.shop.pojo.info;

import java.util.HashMap;
import java.util.Map;

import com.shop.pojo.DocumentType;

public class DocTypeMap {
	
	
	private static Map<String, DocumentType> type ;
	
	static {
		type = new HashMap<>();
		type.put("XS", new DocumentType(new Integer(1),"销售单","XS"));
		
	}
	
	public static DocumentType getType(String typeName) {
		return type.get(typeName);
	}
}
