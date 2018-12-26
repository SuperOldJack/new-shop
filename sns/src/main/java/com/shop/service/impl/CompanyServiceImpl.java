package com.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.CompanyMapper;
import com.shop.pojo.Company;
import com.shop.service.CompanyService;

@Service("companyService")
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyMapper companyMapper;
	
	public Company queryCompanyInfo() {
		return companyMapper.selectCompanyInfo();
	}

}
