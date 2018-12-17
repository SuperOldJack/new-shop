package com.shop.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Moneyio {
	private Integer id;

	private String thisCode;
	
	

	private Card card;

	private Date createTime;

	private Worker manageWork;

	private BigDecimal actualMoney;

	private String comment;

	private Integer ioType;

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
	public String getThisCode() {
		return thisCode;
	}

	public void setThisCode(String thisCode) {
		this.thisCode = thisCode;
	}
	public void setManageWork(Worker manageWork) {
		this.manageWork = manageWork;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment == null ? null : comment.trim();
	}

	public BigDecimal getActualMoney() {
		return actualMoney;
	}

	public void setActualMoney(BigDecimal actualMoney) {
		this.actualMoney = actualMoney;
	}

	public Integer getIoType() {
		return ioType;
	}

	public void setIoType(Integer ioType) {
		this.ioType = ioType;
	}

}