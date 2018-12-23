package com.shop.pojo.document;

import com.shop.pojo.CountUnity;
import com.shop.pojo.Shop;
import com.shop.pojo.Specification;
import com.shop.pojo.info.ShopInfo;

/**
 * 货物汇总 --描述货物在本季度的情况
 * @author Administrator
 *
 */
public class GoodsSummary extends ObjectSummary{

	
	private ShopInfo shopInfo;



	//返回一个商品信息
	@Override
	protected Object getSummaryObject() {
		// TODO Auto-generated method stub
		return shopInfo;
	}
	
	
	

	public ShopInfo getShopInfo() {
		return shopInfo;
	}


	public void setShopInfo(ShopInfo shopInfo) {
		this.shopInfo = shopInfo;
	}


}
