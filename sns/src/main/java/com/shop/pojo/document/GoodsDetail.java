package com.shop.pojo.document;

import com.shop.pojo.CountUnity;
import com.shop.pojo.Shop;
import com.shop.pojo.Specification;

/**
 * 货物汇总 --描述货物在本季度的情况
 * @author Administrator
 *
 */
public class GoodsDetail {

	
	private Shop shop;
	
	

    
    private CountUnity unit;
	
	
	private Specification specification;
	
	//处理数量
	private Integer handleGoodsCount;
	//销售平均单价
	private Integer handleGoodsMoney;
	
	//退货数量
	private Integer returnGoodsCount;
	//退货平均单价
	private Integer returnGoodsMoney;
	
	
	
	/**
	 * 获得退货总金额
	 * @return
	 */
	public int getReturnMoney() {
		int price = returnGoodsMoney == null ? 0:returnGoodsMoney.intValue();
		int count = returnGoodsCount == null ? 0:returnGoodsCount.intValue();
		
		return price * count;
	}
	
	public int getHandleMoney() {
		int price = handleGoodsMoney == null ? 0:handleGoodsMoney.intValue();
		int count = handleGoodsCount == null ? 0:handleGoodsCount.intValue();
		
		return price * count;
	}
	
	/**
	 * 实际金额
	 * 获得处理金额减去回退金额得到实际金额
	 * @return
	 */
	public int getMoney() {
		int returnMoney = getReturnMoney();
		int handleMoney = getHandleMoney();
		
		return handleMoney - returnMoney;
		
	}
	
	/**
	 * 实际总数量
	 * 获得处理总数量减去回退总数量得到实际总数量
	 * @return
	 */
	public int getCount() {
		int handleCount = handleGoodsCount == null ? 0:handleGoodsCount.intValue();
		int returnCount = returnGoodsCount == null ? 0:returnGoodsCount.intValue();
		
		return handleCount - returnCount;
		
	}
	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public Specification getSpecification() {
		return specification;
	}

	public void setSpecification(Specification specification) {
		this.specification = specification;
	}

	public Integer getHandleGoodsCount() {
		return handleGoodsCount;
	}

	public void setHandleGoodsCount(Integer handleGoodsCount) {
		this.handleGoodsCount = handleGoodsCount;
	}

	public Integer getHandleGoodsMoney() {
		return handleGoodsMoney;
	}

	public void setHandleGoodsMoney(Integer handleGoodsMoney) {
		this.handleGoodsMoney = handleGoodsMoney;
	}

	public Integer getReturnGoodsCount() {
		return returnGoodsCount;
	}

	public void setReturnGoodsCount(Integer returnGoodsCount) {
		this.returnGoodsCount = returnGoodsCount;
	}

	public Integer getReturnGoodsMoney() {
		return returnGoodsMoney;
	}

	public void setReturnGoodsMoney(Integer returnGoodsMoney) {
		this.returnGoodsMoney = returnGoodsMoney;
	}
	
	public CountUnity getUnit() {
		return unit;
	}

	public void setUnit(CountUnity unit) {
		this.unit = unit;
	}

}
