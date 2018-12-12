package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.BankMapper;
import com.shop.pojo.Bank;
import com.shop.service.BankService;

@Service("bankService")
public class BankServiceImpl implements BankService{

	@Autowired
	BankMapper bankMapper;
	
	@Override
	public List<Bank> getBankList() {
		
		return bankMapper.getBankList();
	}

}
