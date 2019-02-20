package com.shop.tools;

import com.shop.controller.DocumentController;

public class CodeMake {
	 /**
	 * 初始化CodeMake  
	 * --删除此方法则可以变成普通的工具类,但项目需求
	 * @param type
	 * @return
	 */
	public static CodeMake initCodeMake(String type) {
		CodeMake codeMake = new CodeMake(type);
		int code = DocumentController.documentController.GetTodayCodeByType(type);
		
		codeMake.setCode(code+1);
		
		return codeMake;
	}
	
	private  int code = 0;
	private final  String codeType;
	
	public CodeMake(String codeType) {
		this.codeType = codeType;
	}
	
	public synchronized String getCode() {
		code++;
		
		String datacode = DateUnit.getNowDateFormat();
		
		//设置编号
		StringBuffer codeInt = new StringBuffer().append(codeType).append("-").append(datacode).append("-"); 
		for (int i = 0; i < 6 - (code+"").length() ; i++) {
			codeInt.append("0");
		}
		codeInt.append(code);
		
		return codeInt.toString();
	}
	
	public void setCode(int code) {
		this.code = code;
	}
}
