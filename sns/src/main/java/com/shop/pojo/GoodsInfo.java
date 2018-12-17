package com.shop.pojo;

import java.math.BigDecimal;
/**
 * 货物信息表
 * @author Administrator
 *
 */
public class GoodsInfo {
    private Integer id;

    private String goods_document_code;

    private Integer shop_id;

    private Integer specification_id;

    private BigDecimal price;

    private Integer count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoods_document_code() {
        return goods_document_code;
    }

    public void setGoods_document_code(String goods_document_code) {
        this.goods_document_code = goods_document_code == null ? null : goods_document_code.trim();
    }

    public Integer getShop_id() {
        return shop_id;
    }

    public void setShop_id(Integer shop_id) {
        this.shop_id = shop_id;
    }

    public Integer getSpecification_id() {
        return specification_id;
    }

    public void setSpecification_id(Integer specification_id) {
        this.specification_id = specification_id;
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