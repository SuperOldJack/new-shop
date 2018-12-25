package com.shop.pojo;

/**
 * 出库
 * @author Administrator
 *
 */
public class OutLibAndUse {
    private Integer id;

    /**
     * 出库单单号
     */
    private GoodsDocument goods;

    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

	public GoodsDocument getGoods() {
		return goods;
	}

	public void setGoods(GoodsDocument goods) {
		this.goods = goods;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

    
}