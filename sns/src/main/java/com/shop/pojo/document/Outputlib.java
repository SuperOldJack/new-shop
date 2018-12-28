package com.shop.pojo.document;

import com.shop.pojo.GoodsDocument;
import com.shop.pojo.User;

/**
 * 出库
 * @author Administrator
 *
 */
public class Outputlib implements IDoc{
    private Integer id;

    /**
     * 出库单单号
     */
    private GoodsDocument goodsDocument;

    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


	public GoodsDocument getGoodsDocument() {
		return goodsDocument;
	}

	public void setGoodsDocument(GoodsDocument goodsDocument) {
		this.goodsDocument = goodsDocument;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

    
}