package com.shop.service;

import java.util.List;

import com.shop.pojo.document.PayrecAndInLib;
import com.shop.pojo.document.PayrecAndOutLib;

public interface PaymentService {

	/**
	 * 查询付款单
	 * @return
	 */
	List<PayrecAndInLib> queryPaymentDoc();
	
	/**
	 * 查询收款单
	 * @return
	 */
	List<PayrecAndOutLib> queryReceiptsDoc();
}
