package com.shop.pojo.document;

import java.math.BigDecimal;

import com.shop.pojo.GoodsDocument;
import com.shop.pojo.UserInfo;

public class OrderGoods {
	private Integer id;

	private GoodsDocument goodsDocument;



	private UserInfo client;
	
	private BigDecimal amount_money;

	private BigDecimal actual_money;

	private Integer card_id;

	private String comment;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public GoodsDocument getGoodsDocument() {
		return goodsDocument;
	}

	public void setGoodsDocument(GoodsDocument goodsDocument) {
		this.goodsDocument = goodsDocument;
	}

	public UserInfo getClient() {
		return client;
	}

	public void setClient(UserInfo client) {
		this.client = client;
	}
	public BigDecimal getAmount_money() {
		return amount_money;
	}

	public void setAmount_money(BigDecimal amount_money) {
		this.amount_money = amount_money;
	}

	public BigDecimal getActual_money() {
		return actual_money;
	}

	public void setActual_money(BigDecimal actual_money) {
		this.actual_money = actual_money;
	}

	public Integer getCard_id() {
		return card_id;
	}

	public void setCard_id(Integer card_id) {
		this.card_id = card_id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment == null ? null : comment.trim();
	}
}