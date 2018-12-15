package com.shop.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.pojo.Bank;
import com.shop.service.BankService;

@Controller
@RequestMapping("bank")
public class BankController {
	
	@Autowired
	BankService bankService;
	
	@RequestMapping("/test")
	public String test(Model model) {
		model.addAttribute("bankList", bankService.getBankList());
		return "/test";
	}
	
	
	@RequestMapping("/out")
	public String out() {
		Bank bank = bankService.getBankList().get(0);
		try {
			ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\reset.txt"));
			oo.writeObject(bank);
			System.out.println("写入成功");
			oo.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "/test";
	}
	
	@RequestMapping("/input")
	public String input() {
		try {
			
			ObjectInput oi = new ObjectInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\reset.txt"));
			Bank bank = (Bank)oi.readObject();
			System.out.println("名字："+bank.getCustomerName());
			oi.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
