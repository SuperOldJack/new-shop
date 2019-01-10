package com.shop.tools;

/**
 * 分页工具类
 * @author Administrator
 *
 */
public class PageTool implements IPageTool{

	public PageTool(int currentPageNo,int totalCount) {
		this.setCurrentPageNo(currentPageNo);
		this.setTotalCount(totalCount);
	}

	/**
	 * 当前页码-来自于用户输入
	 * 从第一页开始算
	 */
	private int currentPageNo = 0;

	//总数量（表）
	private int totalCount = 0;

	//页面容量
	private int pageSize = 10;

	//总页数-totalCount/pageSize（+1）
	private int totalPageCount = 1;

	//下一页 
	private int nextPage;

	//上一页
	private int prePage;


	@Override
	public int getCurrentPageNo() {
		return currentPageNo;
	}
	
	@Override
	public int getCurrentPageIndex() {
		return (getCurrentPageNo()-1) * getPageSize();
	}
	
	@Override
	public void setCurrentPageNo(int currentPageNo) {
		if(currentPageNo > 0){
			this.currentPageNo = currentPageNo;
		}else {
			this.currentPageNo=1;
		}
	}
	@Override
	public int getTotalCount() {
		return totalCount;
	}

	@Override
	public void setTotalCount(int totalCount) {
		if(totalCount > 0){
			this.totalCount = totalCount;
			//设置总页数
			this.setTotalPageCountByRs();
		}
	}
	@Override
	public int getPageSize() {
		return pageSize;
	}
	@Override
	public void setPageSize(int pageSize) {
		if(pageSize > 0){
			this.pageSize = pageSize;
		}
	}
	@Override
	public int getTotalPageCount() {
		return totalPageCount;
	}
	@Override
	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	@Override
	public void setTotalPageCountByRs(){
		if(this.totalCount % this.pageSize == 0){
			this.totalPageCount = this.totalCount / this.pageSize;
		}else if(this.totalCount % this.pageSize > 0){
			this.totalPageCount = this.totalCount / this.pageSize + 1;
		}else{
			this.totalPageCount = 0;
		}
	}
	@Override
	public int getNextPage() {
		if(currentPageNo<totalPageCount){
			nextPage = currentPageNo+1;
		}else{
			nextPage = totalPageCount;
		}
		return nextPage;
	}
	@Override
	public int getPrePage() {
		if(currentPageNo>1){
			prePage = currentPageNo-1;
		}else{
			prePage = 1;
		}
		return prePage;
	}    
}