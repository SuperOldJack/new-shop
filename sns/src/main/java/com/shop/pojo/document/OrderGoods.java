package com.shop.pojo.document;

import java.math.BigDecimal;

import com.shop.pojo.Card;
import com.shop.pojo.GoodsDocument;
import com.shop.pojo.UserInfo;

public class OrderGoods {
	
	private Integer id;

	private GoodsDocument goodsDocument;

	

	private UserInfo client;
	
	private BigDecimal amount_money;

	private BigDecimal actual_money;

	//外键ID 只读
	private Integer card_id;
	
	private Card card;

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		
		card_id = card.getId();
		this.card = card;
	}

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
		if(card_id == null && card != null) {
			card_id = card.getId();
		}
		return card_id;
	}


}