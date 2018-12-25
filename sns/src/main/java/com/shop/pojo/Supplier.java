package com.shop.pojo;

public class Supplier {
    private Integer id;

    private String linker_name;

    private String unit;

    private String address;

    private String phone;

    private String e_mail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLinker_name() {
        return linker_name;
    }

    public void setLinker_name(String linker_name) {
        this.linker_name = linker_name == null ? null : linker_name.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail == null ? null : e_mail.trim();
    }
}