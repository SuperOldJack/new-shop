package com.shop.pojo;

public class CountUnity {
    private Integer id;

    private String unit_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUnit_name() {
        return unit_name;
    }

    public void setUnit_name(String unit_name) {
        this.unit_name = unit_name == null ? null : unit_name.trim();
    }
}