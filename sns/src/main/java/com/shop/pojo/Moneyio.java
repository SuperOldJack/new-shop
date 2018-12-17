package com.shop.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Moneyio {
    private Integer id;

    private String this_code;

    private Integer card_id;

    private Date create_time;

    private Integer manage_work_id;

    private BigDecimal actual_money;

    private String comment;

    private Integer io_type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getThis_code() {
        return this_code;
    }

    public void setThis_code(String this_code) {
        this.this_code = this_code == null ? null : this_code.trim();
    }

    public Integer getCard_id() {
        return card_id;
    }

    public void setCard_id(Integer card_id) {
        this.card_id = card_id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Integer getManage_work_id() {
        return manage_work_id;
    }

    public void setManage_work_id(Integer manage_work_id) {
        this.manage_work_id = manage_work_id;
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