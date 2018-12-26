package com.shop.pojo.info;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.shop.pojo.GoodsDocument;
import com.shop.pojo.GoodsInfo;
import com.shop.pojo.Shop;
import com.shop.pojo.Specification;

/**
 * 填充获品信息集合
 * @author Administrator
 *
 */
public class FullGoodsInfoListble {
	/**
	 * 填充货品信息
	 * @param code --信息所对应的单据号
	 * @param shopId --商品ID
	 * @param shopUnit --商品单位
	 * @param shopSpecification --商品规格
	 * @param goodsPrice --商品单价
	 * @param goodsCount --商品总数
	 * @return
	 */
	public static List<GoodsInfo> fullInfoList(String code,Integer[] shopId,Integer[] shopUnit,Integer[] shopSpecification,BigDecimal[] goodsPrice,Integer[] goodsCount){
		List<GoodsInfo> goodsInfos = new ArrayList<>();
		for (int i = 0;i<shopId.length;i++) {
			GoodsInfo info = new GoodsInfo();
			info.setGoodsDocument(new GoodsDocument(code));
			info.setShop(new Shop(shopId[i]));
			info.setPrice(goodsPrice[i]);
			info.setUnitId(shopUnit[i]);
			info.setSpecification(new Specification(shopSpecification[i]));
			info.setCount(goodsCount[i]);
			goodsInfos.add(info);
		}
		return goodsInfos;
	}
}
