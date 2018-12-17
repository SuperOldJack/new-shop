package com.shop.pojo;

public class Lib {
    private Integer id;

    private String name;

    private String address;

    private String lib_phone;

    /**
     * 仓库管理员姓名
     */
    private String lib_manage_man;

    private String manage_phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getLib_phone() {
        return lib_phone;
    }

    public void setLib_phone(String lib_phone) {
        this.lib_phone = lib_phone == null ? null : lib_phone.trim();
    }

    public String getLib_manage_man() {
        return lib_manage_man;
    }

    public void setLib_manage_man(String lib_manage_man) {
        this.lib_manage_man = lib_manage_man == null ? null : lib_manage_man.trim();
    }

    public String getManage_phone() {
        return manage_phone;
    }

    public void setManage_phone(String manage_phone) {
        this.manage_phone = manage_phone == null ? null : manage_phone.trim();
    }
}