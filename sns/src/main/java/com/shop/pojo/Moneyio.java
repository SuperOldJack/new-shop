package com.shop.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Moneyio {
	private Integer id;

	private GoodsDocument goodsDocument;

	

	private Card card;

	private Date create_time;

	private Worker manageWork;

	private BigDecimal actual_money;

	private String comment;

	private Integer io_type;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public Worker getManageWork() {
		return manageWork;
	}
	public GoodsDocument getGoodsDocument() {
		return goodsDocument;
	}

	public void setGoodsDocument(GoodsDocument goodsDocument) {
		this.goodsDocument = goodsDocument;
	}
	public void setManageWork(Worker manageWork) {
		this.manageWork = manageWork;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}


	public BigDecimal getActual_money() {
		return actual_money;
	}

	public void setActual_money(BigDecimal actual_money) {
		this.actual_money = actual_money;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment == null ? null : comment.trim();
	}

	public Integer getIo_type() {
		return io_type;
	}

	public void setIo_type(Integer io_type) {
		this.io_type = io_type;
	}
}