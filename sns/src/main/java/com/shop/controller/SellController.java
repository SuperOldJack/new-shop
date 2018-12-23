package com.shop.controller;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.pojo.GoodsDocument;
import com.shop.pojo.GoodsInfo;
import com.shop.pojo.Shop;
import com.shop.pojo.Specification;
import com.shop.pojo.document.GoodsSummary;
import com.shop.pojo.document.OrderGoods;
import com.shop.service.GoodsInfoService;
import com.shop.service.OrderGoodsService;
import com.shop.service.SellReturnService;
import com.shop.socket.OrderGoodsSocket;
import com.shop.tools.DateUnit;

@RequestMapping("/sellManage")
@Controller
public class SellController {
	
	@Autowired
	SellReturnService sellReturnService;//销售退款处理 
	
	@Autowired
	OrderGoodsService orderGoodsService;//销售货品处理
	
	@Autowired
	GoodsInfoService goodsInfoService;
	
	@RequestMapping("/sellReturnTest")
	public String sellReturnTest() {
		if(sellReturnService.selectByPrimaryKey(1) == null) System.out.println("OK"); 
		return "jackUserTest"; 
	}
	
	@RequestMapping("/orderGoodsTest")
	public String orderGoodsTest() {
		/*
		 * OrderGoods orderGoods = orderGoodsService.selectById(1);
		 * System.out.println(orderGoods.getCard_id());
		 * */
		return "/sell/addSell"; 
	}
	
	@RequestMapping("/showOrderGoods")
	@ResponseBody
	public List<OrderGoods> showOrderGoods() {
		List<OrderGoods> selectOrderGoodsAll = orderGoodsService.selectOrderGoodsAll();
		return selectOrderGoodsAll;
	}
	
	/**
	 * 查询销售货品明细
	 * @return
	 */
	@RequestMapping("/orderGoodsSelect")
	@ResponseBody
	public List<GoodsInfo> orderGoodsSelect() {
		List<GoodsInfo> orderGoodsSelect = goodsInfoService.orderGoodsSelect();
		return orderGoodsSelect;
	}
	
	
	@RequestMapping("/goodsSummaryAll")
	@ResponseBody
	public List<GoodsSummary> goodsDetailAll() {
		List<GoodsSummary> goodsDetailAll = orderGoodsService.getGoodsDetailAll();
		return goodsDetailAll;
	}
	
	@RequestMapping("/orderGoodsAdd")
	public synchronized String orderGoodsAdd(OrderGoods orderGoods,Integer[] shopId,Integer[] shopUnit,Integer[] shopSpecification,BigDecimal[] goodsPrice,Integer[] goodsCount) {
		
		String documentCode = orderGoods.getGoodsDocument().getCode();
		try {

			//添加货品信息
			List<GoodsInfo> goodsInfos = fullInfoList(documentCode,shopId,shopUnit,shopSpecification,goodsPrice,goodsCount);
			
			//添加销售单
			int result = orderGoodsService.seveOrderGoods(orderGoods,goodsInfos);
			
			if(result > 0) {
				
				String datacode = DateUnit.getNowDateFormat();
				
				OrderGoodsSocket.sendDocumentCode("XS-"+datacode);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("出现异常");
			return "error"; 
		}
		return "/goHome"; 
	}
	
	/**
	 * 填充货品信息
	 * @param code --信息所对应的单据号
	 * @param shopId --商品ID
	 * @param shopUnit --商品单位
	 * @param shopSpecification --商品规格
	 * @param goodsPrice --商品单价
	 * @param goodsCount --商品总数
	 * @return
	 */
	private List<GoodsInfo> fullInfoList(String code,Integer[] shopId,Integer[] shopUnit,Integer[] shopSpecification,BigDecimal[] goodsPrice,Integer[] goodsCount){
		List<GoodsInfo> goodsInfos = new ArrayList<>();
		for (int i = 0;i<shopId.length;i++) {
			GoodsInfo info = new GoodsInfo();
			info.setGoodsDocument(new GoodsDocument(code));
			info.setShop(new Shop(shopId[i]));
			info.setPrice(goodsPrice[i]);
			info.setUnitId(shopUnit[i]);
			info.setSpecification(new Specification(shopSpecification[i]));
			info.setCount(goodsCount[i]);
			goodsInfos.add(info);
		}
		return goodsInfos;
	}
}
