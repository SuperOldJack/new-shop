package com.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SnsApplication {

	/**
	 * 需要放在该类的子集下面才会被解析
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SnsApplication.class, args);
	}
}
