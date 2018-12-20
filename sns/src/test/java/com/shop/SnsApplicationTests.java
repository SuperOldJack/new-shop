package com.shop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.shop.pojo.VipInfo;
import com.shop.service.VipInfoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SnsApplicationTests {

	@Autowired
	VipInfoService vipInfoService;
	
	@Test
	public void contextLoads() {
		VipInfo vip = vipInfoService.selectByVipNumber("123456789");
		System.out.println(vip.getPassword());
	}
	
}
