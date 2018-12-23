package com.shop.pojo.document;

import com.shop.pojo.User;

/**
 * 用户明细表
 * 描述用户本季度的情况（销售）
 * @author Administrator
 *
 */
public  class ClientSummary extends ObjectSummary{
	
	/**
	 * 用户对象 --查找明细的对象
	 */
	private User user;
	
	
	@Override
	public Object getSummaryObject() {
		return user;
	}
	
}
