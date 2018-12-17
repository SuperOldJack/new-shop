package com.shop.pojo;

import java.math.BigDecimal;

public class Specification {
    private Integer id;

    private Integer specification_type;

    private BigDecimal info;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpecification_type() {
        return specification_type;
    }

    public void setSpecification_type(Integer specification_type) {
        this.specification_type = specification_type;
    }

    public BigDecimal getInfo() {
        return info;
    }

    public void setInfo(BigDecimal info) {
        this.info = info;
    }
}