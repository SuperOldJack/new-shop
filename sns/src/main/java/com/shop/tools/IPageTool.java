package com.shop.tools;

public interface IPageTool {
	public int getCurrentPageNo() ;

	public void setCurrentPageNo(int currentPageNo) ;

	public int getTotalCount() ;

	
	public void setTotalCount(int totalCount) ;
	public int getPageSize() ;
	public void setPageSize(int pageSize) ;

	public int getTotalPageCount() ;

	public void setTotalPageCount(int totalPageCount) ;
	
	public void setTotalPageCountByRs();
	public int getNextPage() ;
    public int getPrePage() ;
}
