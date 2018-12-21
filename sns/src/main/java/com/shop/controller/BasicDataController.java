package com.shop.controller;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.pojo.Company;
import com.shop.pojo.VipInfo;
import com.shop.pojo.Worker;
import com.shop.service.VipInfoService;
import com.shop.service.WorkerService;
import com.shop.tools.Md5;
import com.shop.tools.StringTool;

@Controller
public class BasicDataController {
	
	@Autowired
	private VipInfoService vipInfoService;
	@Autowired			
	private WorkerService workerService;
	
	@RequestMapping("/addEmp")
	@ResponseBody
	public Object addEmp(Model model, Worker worker) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		worker.setVip_code(StringTool.getCarId());
		if(workerService.addWorker(worker) > 0) {
			VipInfo vip = new VipInfo();
			vip.setVip_code(worker.getVip_code());
			vip.setVip_number("emp_" + StringTool.getCarId());
			vip.setPassword(Md5.EncoderByMd5("123456")); //密码默认为123456
			Company company = new Company();
			company.setId(1);
			vip.setCompany(company);
			if(vipInfoService.addVip(vip) > 0) {
				model.addAttribute("addEmpMsg", "添加员工成功");
				return "home";	
			} else {
				model.addAttribute("addEmpMsg", "添加员工失败");
				return "home";
			}
		} else {
			model.addAttribute("addEmpMsg", "添加员工失败");
			return "home";
		}
	}
	
	/**
	 * 更新公司信息
	 * @param model
	 * @param com
	 * @return
	 */
	@RequestMapping("/updateCompanyInfo")
	public String updateCompanyInfo(Model model, Company com) {
		
		return "ok";
	}
	
	/**
	 * 获取公司信息
	 * @param model
	 * @return
	 */
	@RequestMapping("/getCompanyInfo")
	public String getCompanyInfo(Model model) {
		
		return "";
	}
}
