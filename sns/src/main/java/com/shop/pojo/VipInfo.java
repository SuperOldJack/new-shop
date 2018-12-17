package com.shop.pojo;

import java.util.Date;

public class VipInfo {
    private Integer id;

    private String vip_number;

    private String password;

    private Date createtime;

    private Date up_time;

    private Date down_time;

    private String vip_code;

    private Integer company_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVip_number() {
        return vip_number;
    }

    public void setVip_number(String vip_number) {
        this.vip_number = vip_number == null ? null : vip_number.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUp_time() {
        return up_time;
    }

    public void setUp_time(Date up_time) {
        this.up_time = up_time;
    }

    public Date getDown_time() {
        return down_time;
    }

    public void setDown_time(Date down_time) {
        this.down_time = down_time;
    }

    public String getVip_code() {
        return vip_code;
    }

    public void setVip_code(String vip_code) {
        this.vip_code = vip_code == null ? null : vip_code.trim();
    }

    public Integer getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Integer company_id) {
        this.company_id = company_id;
    }
}