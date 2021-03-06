package com.shop.pojo;

import java.util.Date;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.format.annotation.DateTimeFormat;

public class Worker {
	private Integer id;

	private String name;

	private String sex;

	private String address;

	private String e_mail;

	private String phone;

	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;
	
	private VipInfo vip;


	public VipInfo getVip() {
		return vip;
	}

	public void setVip(VipInfo vip) {
		this.vip = vip;
	}

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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex == null ? null : sex.trim();
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
	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}