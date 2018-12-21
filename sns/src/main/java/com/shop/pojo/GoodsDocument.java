package com.shop.pojo;

import java.util.Date;

/**
 * 货物单  --单据类
 * @author Administrator
 *
 */
public class GoodsDocument {
	
	public GoodsDocument() {}
	public GoodsDocument(String code) {
		this.code = code;
	}
	
	
    private String code;

    /**
     * 处理仓库
     */
    private Lib manageLib;

    /**
     * 负责人
     */
	private Worker manageMan;

    

	private Date create_time;

	/**
     * 制单人
     */
    private Worker createMan;

    

	private String document_type;

    private Integer isEffective;

    private String comment;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }
    public Worker getCreateMan() {
		return createMan;
	}

	public void setCreateMan(Worker createMan) {
		this.createMan = createMan;
	}
	public Lib getManageLib() {
		return manageLib;
	}

	public void setManageLib(Lib manageLib) {
		this.manageLib = manageLib;
	}

	public Worker getManageMan() {
		return manageMan;
	}

	public void setManageMan(Worker manageMan) {
		this.manageMan = manageMan;
	}
    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }


    public String getDocument_type() {
        return document_type;
    }

    public void setDocument_type(String document_type) {
        this.document_type = document_type == null ? null : document_type.trim();
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
    public void setIsEffective(boolean isEffective) {
        this.isEffective = isEffective ? 1:0;
    }
    
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}