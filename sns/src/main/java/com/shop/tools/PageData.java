package com.shop.tools;

import java.util.List;

/**
 * 分页数据的容器
 * 保存分页好的集合同时实现分页器的功能
 * @author Administrator
 *
 */
public class PageData<T> extends PageTool{

	public PageData(int currentPageNo, int totalCount) {
		super(currentPageNo, totalCount);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 分页后获取到的数据
	 */
	private List<T> pageData;

	/**
	 * 获得分页数据
	 * @return
	 */
	public List<T> getPageData() {
		return pageData;
	}
	
	/**
	 * 修改分页数据
	 * @param data
	 */
	public void setPageData(List<T> data) {
		this.pageData = data;
	}
	
	
}
