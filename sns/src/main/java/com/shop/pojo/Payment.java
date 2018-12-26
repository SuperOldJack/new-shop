package com.shop.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 收付款单详情
 * @author Administrator
 *
 */
public class Payment {
    private Integer id;

    /**
     * 收款单为0 付款单为1
     */
    private Integer type;

    private Date dealtime;

    /**
     * 收付款单
     */
    private GoodsDocument goods;

    /**
     * 卡号
     */
    private Card card;

    /**
     * 处理人id
     */
    private Worker work;

    private BigDecimal actual_money;

    private String comment;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Date getDealtime() {
		return dealtime;
	}

	public void setDealtime(Date dealtime) {
		this.dealtime = dealtime;
	}

	public GoodsDocument getGoods() {
		return goods;
	}

	public void setGoods(GoodsDocument goods) {
		this.goods = goods;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public Worker getWork() {
		return work;
	}

	public void setWork(Worker work) {
		this.work = work;
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
		this.comment = comment;
	}

}