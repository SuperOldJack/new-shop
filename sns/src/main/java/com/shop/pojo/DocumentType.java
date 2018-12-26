package com.shop.pojo;

public class DocumentType {
	public DocumentType() {

	}
	public DocumentType(Integer id,String unit_name,String abbreviation) {
		this.id = id;
		this.unit_name = unit_name;
		this.abbreviation = abbreviation;
	}
    private Integer id;

    private String unit_name;

    private String abbreviation;

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

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation == null ? null : abbreviation.trim();
    }
}