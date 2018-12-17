package com.shop.pojo;

import java.util.Date;

/**
 * 货物单  --单据类
 * @author Administrator
 *
 */
public class GoodsDocument {
    private String code;

    private Integer manage_lib_id;

    private Integer manage_man_id;

    private Date create_time;

    private Integer create_man;

    private String document_type;

    private Integer isEffective;

    private String comment;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getManage_lib_id() {
        return manage_lib_id;
    }

    public void setManage_lib_id(Integer manage_lib_id) {
        this.manage_lib_id = manage_lib_id;
    }

    public Integer getManage_man_id() {
        return manage_man_id;
    }

    public void setManage_man_id(Integer manage_man_id) {
        this.manage_man_id = manage_man_id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Integer getCreate_man() {
        return create_man;
    }

    public void setCreate_man(Integer create_man) {
        this.create_man = create_man;
    }

    public String getDocument_type() {
        return document_type;
    }

    public void setDocument_type(String document_type) {
        this.document_type = document_type == null ? null : document_type.trim();
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}