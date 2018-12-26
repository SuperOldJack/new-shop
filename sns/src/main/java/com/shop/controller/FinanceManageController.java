package com.shop.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.pojo.Payment;
import com.shop.pojo.PayrecAndInLib;
import com.shop.pojo.PayrecAndOutLib;
import com.shop.service.PaymentService;

/**
 * 财务管理
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/finance")
public class FinanceManageController {

	@Autowired
	private PaymentService paymentService;
	
	/**
	 * 查询付款单信息
	 * @param session
	 * @return
	 */
	@RequestMapping("/queryPayment")
	@ResponseBody
	public List<PayrecAndInLib> queryPayment(HttpSession session) {
		session.putValue("last", "/home/finance/pay");
		return paymentService.queryPaymentDoc();
	}
	
	/**
	 * 查询收款单信息
	 * @param session
	 * @return
	 */
	@RequestMapping("/queryReceipts")
	@ResponseBody
	public List<PayrecAndOutLib> queryRecment(HttpSession session) {
		session.putValue("last", "/home/finance/pay");
		return paymentService.queryReceiptsDoc();
	}
}
