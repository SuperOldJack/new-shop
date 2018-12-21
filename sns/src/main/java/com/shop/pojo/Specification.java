package com.shop.pojo;

import java.math.BigDecimal;

public class Specification {
	public Specification() {}
	public Specification(Integer id) {
		this.id = id;
	}
	
    private Integer id;

    private String specificationType;

    public String getSpecificationType() {
		return specificationType;
	}

	public void setSpecificationType(String specificationType) {
		this.specificationType = specificationType;
	}

	private BigDecimal info;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public BigDecimal getInfo() {
        return info;
    }

    public void setInfo(BigDecimal info) {
        this.info = info;
    }
}