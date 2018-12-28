package com.shop.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.pojo.document.PayrecAndInLib;
import com.shop.pojo.document.PayrecAndOutLib;
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
	 * 查询所有付款单信息
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
	 */
	@RequestMapping("/queryReceipts")
	@ResponseBody
	public List<PayrecAndOutLib> queryRecment(HttpSession session) {
		session.putValue("last", "/home/finance/pay");
		return paymentService.queryReceiptsDoc();
	}
	
	/**
	 * 查询入库单的信息
	 */
	@RequestMapping("/queryInLibDocInfo")
	public String queryInLibDocInfo(Model model, String Code) {
		System.out.println("需要查询的入库单是：" + Code);
		model.addAttribute("code", Code);
		return "finance/docInfo/inLibInfo";
	}
	
	
	/**
	 * 查询付款单信息
	 */
	@RequestMapping("/queryPayDocInfo")
	public String queryPayDocInfo(Model model, String Code) {
		System.out.println("需要查询的付款单是：" + Code);
		model.addAttribute("code", Code);
		return "finance/docInfo/payDocInfo";
	}
	
	/**
	 * 查询出库单信息
	 */
	@RequestMapping("/queryOutLibInfo")
	public String queryOutLibInfo(Model model, String Code) {
		System.out.println("需要查询的出库单是：" + Code);
		model.addAttribute("code", Code);
		return "finance/docInfo/outLibInfo";
	}
	
	/**
	 * 查询收款单信息
	 */
	@RequestMapping("/queryRecDocInfo")
	public String queryRecDocInfo(Model model, String Code) {
		System.out.println("需要查询的收款单是：" + Code);
		model.addAttribute("code", Code);
		return "finance/docInfo/recDocInfo";
	}
}
