package com.shop.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.pojo.GoodsInfo;
import com.shop.pojo.document.Inputlib;
import com.shop.pojo.document.OrderGoods;
import com.shop.pojo.info.FullGoodsInfoListble;
import com.shop.service.InputLibService;
import com.shop.socket.OrderGoodsSocket;

@Controller
@RequestMapping("/stock")
public class StockController {
	
	@Autowired
	InputLibService inputLibService; 
	
	/**
	 * 新增入库表
	 * @return
	 */
	@RequestMapping("/addInputLib")
	public synchronized String addInputLib(Inputlib inputlib,Integer[] shopId,Integer[] shopUnit,Integer[] shopSpecification,BigDecimal[] goodsPrice,Integer[] goodsCount) {
		
			
			String documentCode = inputlib.getGoodsDocument().getCode();
			try {

				//添加货品信息
				List<GoodsInfo> goodsInfos = FullGoodsInfoListble.fullInfoList(documentCode,shopId,shopUnit,shopSpecification,goodsPrice,goodsCount);
				
				//添加入库
				int result = inputLibService.seveInputLib(inputlib,goodsInfos);
				
				if(result > 0) {
					
				}
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("出现异常");
				return "error"; 
			}

		
		return null;
	}
	
}