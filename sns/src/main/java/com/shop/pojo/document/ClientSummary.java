package com.shop.pojo.document;

import com.shop.pojo.UserInfo;

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
	private UserInfo user;
	
	
	
	public UserInfo getUser() {
		return user;
	}


	public void setUser(UserInfo user) {
		this.user = user;
	}


	@Override
	public Object getSummaryObject() {
		return user;
	}
	
}
