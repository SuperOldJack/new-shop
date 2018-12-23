package com.shop.pojo.info;

import com.shop.pojo.CountUnity;
import com.shop.pojo.Shop;
import com.shop.pojo.Specification;

/**
 * 商品信息类  --复合类
 * 保存 商品、单位、规格 信息
 * @author Administrator
 *
 */
public class ShopInfo {
	private Shop shop;

	private CountUnity unit;
	
	
	private Specification specification;
	
	
    public Shop getShop() {
		return shop;
	}


	public void setShop(Shop shop) {
		this.shop = shop;
	}


	public CountUnity getUnit() {
		return unit;
	}


	public void setUnit(CountUnity unit) {
		this.unit = unit;
	}


	public Specification getSpecification() {
		return specification;
	}


	public void setSpecification(Specification specification) {
		this.specification = specification;
	}


}
