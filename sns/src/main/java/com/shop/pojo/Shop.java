package com.shop.pojo;

public class Shop {
	public Shop() {}
	public Shop(Integer id) {
		this.id = id;
	}
    private Integer id;

    private String name;

    private String content;
    
    public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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
}