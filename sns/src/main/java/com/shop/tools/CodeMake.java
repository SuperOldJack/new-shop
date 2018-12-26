package com.shop.tools;

public class CodeMake {
	private  int code = 0;
	private final  String codeType;
	
	public CodeMake(String codeType) {
		this.codeType = codeType;
	}
	
	public  String getCode() {
		code++;
		
		String datacode = DateUnit.getNowDateFormat();
		
		StringBuffer codeInt = new StringBuffer().append(codeType).append("-").append(datacode).append("-"); 
		for (int i = 0; i < 6 - (code+"").length() ; i++) {
			codeInt.append("0");
		}
		codeInt.append(code);
		
		return codeInt.toString();
	}
}
