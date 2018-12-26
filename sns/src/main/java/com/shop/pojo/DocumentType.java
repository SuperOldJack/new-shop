package com.shop.pojo;

public class DocumentType {
	public DocumentType() {

	}
	public DocumentType(Integer id,String unit_name,String abbreviation) {
		this.id = id;
		this.type_name = unit_name;
		this.abbreviation = abbreviation;
	}
    private Integer id;

    private String type_name;

    
	private String abbreviation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType_name() {
		return type_name;
	}
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}
    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation == null ? null : abbreviation.trim();
    }
}