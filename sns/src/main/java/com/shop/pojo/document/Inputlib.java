package com.shop.pojo.document;

import com.shop.pojo.GoodsDocument;
import com.shop.pojo.Supplier;

/**
 * 入库单据
 * @author Administrator
 *
 */
public class Inputlib implements IDoc{
	private Integer id;

	private GoodsDocument goodsDocument;

	private Supplier supplier;//供应商


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public GoodsDocument getGoodsDocument() {
		return goodsDocument;
	}

	public void setGoodsDocument(GoodsDocument goodsDocument) {
		this.goodsDocument = goodsDocument;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

}