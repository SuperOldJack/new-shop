package com.shop.tools;

import java.util.UUID;

public class StringTool {

	public static String getCarId() {
		UUID uuid = UUID.randomUUID();
		String str = uuid.toString().substring(0, 6);
		System.out.println(str);
		return str;
	}
	
	
	public static void main(String[] args) {
		getCarId();
	}
}
