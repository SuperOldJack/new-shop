package com.shop;

import java.util.concurrent.TimeUnit;

import org.aspectj.apache.bcel.generic.MULTIANEWARRAY;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shop.mapper.document.SellReturnMapper;
@SpringBootApplication
public class SnsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnsApplication.class, args);
		
		
		/*new Thread(()-> {
			try {
				TimeUnit.MILLISECONDS.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Test test = new Test();
			test.run();
		}).start();*/
	}
}

