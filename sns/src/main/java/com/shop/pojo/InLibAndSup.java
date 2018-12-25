package com.shop.pojo;

/**
 * 入库
 * @author Administrator
 *
 */
public class InLibAndSup {
    private Integer id;

    private GoodsDocument goods;

    private Supplier supplier;

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

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

}