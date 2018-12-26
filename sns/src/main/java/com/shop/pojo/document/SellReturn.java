package com.shop.pojo.document;

import java.math.BigDecimal;
import java.util.Date;

import com.shop.pojo.GoodsDocument;

public class SellReturn implements IDoc{
    private Integer id;

    private GoodsDocument goodsDocument;
    
	private Integer client_id;

    private Date returntime;

    private BigDecimal amount_money;

    private BigDecimal actual_money;

    private Integer card_id;

    private Integer manage_work_id;

    private String cause;

    private String comment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClient_id() {
        return client_id;
    }

    public void setClient_id(Integer client_id) {
        this.client_id = client_id;
    }

    public Date getReturntime() {
        return returntime;
    }

    public void setReturntime(Date returntime) {
        this.returntime = returntime;
    }
    
    @Override
    public GoodsDocument getGoodsDocument() {
		return goodsDocument;
	}

	public void setGoodsDocument(GoodsDocument goodsDocument) {
		this.goodsDocument = goodsDocument;
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

    public Integer getManage_work_id() {
        return manage_work_id;
    }

    public void setManage_work_id(Integer manage_work_id) {
        this.manage_work_id = manage_work_id;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause == null ? null : cause.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}