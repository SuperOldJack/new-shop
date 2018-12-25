package com.shop.tools;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.validator.constraints.Mod10Check;


public class DateUnit {
	
	public static String getNowDateFormat() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String date = simpleDateFormat.format(new Date());
		
		return date;
	}
	
	public static String getNowDateFormat(String format) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		String date = simpleDateFormat.format(new Date());
		
		return date;
	}
}
