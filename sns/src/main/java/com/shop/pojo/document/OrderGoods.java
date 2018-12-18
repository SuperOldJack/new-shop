package com.shop.pojo.document;

import java.math.BigDecimal;

public class OrderGoods {
    private Integer id;

    private String goods_document_code;

    private Integer client_id;

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

    public String getGoods_document_code() {
        return goods_document_code;
    }

    public void setGoods_document_code(String goods_document_code) {
        this.goods_document_code = goods_document_code == null ? null : goods_document_code.trim();
    }

    public Integer getClient_id() {
        return client_id;
    }

    public void setClient_id(Integer client_id) {
        this.client_id = client_id;
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