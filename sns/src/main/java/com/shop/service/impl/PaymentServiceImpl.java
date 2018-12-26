package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.PaymentMapper;
import com.shop.mapper.PayrecAndInLibMapper;
import com.shop.mapper.PayrecAndOutLibMapper;
import com.shop.pojo.Payment;
import com.shop.pojo.PayrecAndInLib;
import com.shop.pojo.PayrecAndOutLib;
import com.shop.service.PaymentService;

@Service("paymentService")
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PayrecAndInLibMapper payrecAndInLibMapper;
	
	@Autowired
	private PayrecAndOutLibMapper payrecAndOutLibMapper;
	
	@Override
	public List<PayrecAndInLib> queryPaymentDoc() {
		return payrecAndInLibMapper.selectPaymentDoc();
	}

	@Override
	public List<PayrecAndOutLib> queryReceiptsDoc() {
		return payrecAndOutLibMapper.selectReceiptsDoc();
	}

}
