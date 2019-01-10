package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.SupplierMapper;
import com.shop.pojo.Supplier;
import com.shop.service.SupplierService;

@Service("supplierService")
public class SupplierServiceImpl implements SupplierService {

	@Autowired
	private SupplierMapper supplierMapper;
	
	public List<Supplier> queryAllSupplier() {
		return supplierMapper.selectAllSupplier();
	}

}
