package com.shop.controller;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.pojo.Company;
import com.shop.pojo.CountUnity;
import com.shop.pojo.Lib;
import com.shop.pojo.VipInfo;
import com.shop.pojo.Worker;
import com.shop.service.BaseService;
import com.shop.service.CompanyService;
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
	@Autowired	
	private CompanyService companyService;
	@Autowired
	private BaseService baseService;
	/**
	 * 添加员工  密码默认为123456
	 * @param model
	 * @param worker
	 * @param session
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("/addEmp")
	public Object addEmp(Model model, Worker worker, HttpSession session) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		//worker.setVip_code(StringTool.getCarId());
		VipInfo vip = new VipInfo();
		vip.setVip_code(StringTool.getCarId());
		vip.setVip_number("emp_" + StringTool.getCarId());
		vip.setPassword(Md5.EncoderByMd5("123456")); //密码默认为123456
		Company company = new Company();
		company.setId(1);
		vip.setCompany(company);
		
		worker.setVip(vip);
		session.putValue("last", "/home/basicData/empData");
		if(workerService.addWorker(worker) > 0) {
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
	 * 查询人员信息
	 * @param model
	 * @param session
	 * @return
	 */
	@RequestMapping("/getEmpList")
	@ResponseBody
	public List<Worker> getEmpList(Model model, HttpSession session) {
		session.putValue("last", "/home/basicData/empData");
		List<Worker> workerList = workerService.queryWorkerList();
		model.addAttribute("workerList", workerList);
		return workerList;
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
	@RequestMapping("/queryCompanyInfo")
	@ResponseBody
	public Company queryCompanyInfo(HttpSession session) {
		session.putValue("last", "/home/basicData/companyData");
		return companyService.queryCompanyInfo();
	}
	
	/**
	 * 查询仓库信息
	 * @return
	 */
	@RequestMapping("/queryLibInfo")
	@ResponseBody
	public List<Lib> queryLibInfo(HttpSession session) {
		session.putValue("last", "/home/basicData/libData");
		return baseService.queryLibInfo();
	}
	
	/**
	 * 查询计量单位信息
	 * @param session
	 * @return
	 */
	@RequestMapping("/queryMeasUnit")
	@ResponseBody
	public List<CountUnity> queryCountUnityList(HttpSession session) {
		session.putValue("last", "/home/basicData/measUnit");
		return baseService.queryCountUnitList();
	}
}
