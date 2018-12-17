package com.shop.pojo;

import java.math.BigDecimal;
/**
 * 货物信息表
 * @author Administrator
 *
 */
public class GoodsInfo {
    private Integer id;

    private GoodsDocument goodsDocument;
    
    /**
     * 单位名称 --需要修改xml
     */
    private String unit;
    
	private Shop shop;

    private Specification specification;

    private BigDecimal price;

    private Integer count;

    public Integer getId() {
    	
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
    public GoodsDocument getGoodsDocument() {
		return goodsDocument;
	}

	public void setGoodsDocument(GoodsDocument goodsDocument) {
		this.goodsDocument = goodsDocument;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}