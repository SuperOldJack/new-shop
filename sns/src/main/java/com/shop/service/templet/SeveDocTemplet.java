package com.shop.service.templet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shop.mapper.GoodsInfoMapper;
import com.shop.mapper.document.GoodsDocumentMapper;
import com.shop.pojo.GoodsDocument;
import com.shop.pojo.GoodsInfo;
import com.shop.pojo.document.IDoc;

@Service("seveDocTemplet")
public abstract class SeveDocTemplet {
	
	@Autowired 
	public GoodsDocumentMapper goodsDocumentMapper;
	
	@Autowired
	public GoodsInfoMapper goodsInfoMapper;
	
	/**
	 * 保存单据信息   会添加单据表、与单据关联的货品信息表、单据附加内容表(如入库表、采购表等)
	 * @param doc  --添加的单据 类型表(如入库表、采购表等)
	 * @param goodsInfo(货品信息)
	 * @return
	 */
	@Transactional
	public int seveDocInfo(IDoc doc,List<GoodsInfo> goodsInfo) {
		
		
		int docTypeInfoResult =addDocTypeInfo(doc);
		int documentResult =(int)addDoc(doc.getGoodsDocument());
		int goodsResult = goodsInfoMapper.insertList(goodsInfo);
		int result = result(docTypeInfoResult,documentResult,goodsResult);
		return result;
	}
	
	protected int addDoc(GoodsDocument doc) {
		int documentResult =goodsDocumentMapper.insertSelective(doc);
		return documentResult;
	} 
	
	protected int addGoods(List<GoodsInfo> goodsInfo) {
		int goodsResult = goodsInfoMapper.insertList(goodsInfo);
		return goodsResult;
	}
	
	protected int result(int...result) {
		for(int i =0;i<result.length;i++) {
			if(result[i] <= 0) return 0;
		}
		
		return 1;
	}
	
	/**
	 * 添加表单类型信息 (例如入库表、采购表、销售退款表)
	 * @param doc
	 * @return
	 */
	protected abstract int addDocTypeInfo(IDoc doc);
}
	