package com.shop.service.templet;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

import com.shop.tools.ConditionParame;
import com.shop.tools.FindFunction;
import com.shop.tools.PageData;

/**
 * @author Administrator
 * 按条件查找对应数据
 * @param <T> 指定分页数据
 */
public class TPISerTemplet<T> {
	protected FindFunction<T> function;
	
	protected Callable<Integer> countFunction;
	
	public TPISerTemplet(FindFunction<T> function,Callable<Integer> countFunction){
		this.function = function;
		this.countFunction = countFunction;
	}
	
	
	public final PageData<T> createPageData(Map<String,Object> map) {
		Object pageNo = map.get(ConditionParame.currentPageNoKey);
		
		int count = 0;
		count = getCount();
		
		PageData<T> page =createPageTool(Integer.parseInt(pageNo.toString()),count);
		
		map.put(ConditionParame.CurrentPageIndexKey, page.getCurrentPageIndex());
		map.put(ConditionParame.PageSizeKey, page.getPageSize());
		
		List<T> selectByPage = loadData(map);
		page.setPageData(selectByPage);
		return page;
	}
	
	
	/**
	 * 获取数据最大值
	 * @return
	 * @throws Exception 
	 */
	protected int getCount() {
		if(countFunction == null) {
			return 0;
		}else {
			try {
				return countFunction.call();
			} catch (Exception e) {
				e.printStackTrace();
				return 0;
			}
		}
	}
	
	/**
	 * 创建分页器
	 * @param currentPageNo 当前页码
	 * @param count 数据总数
	 * @return
	 */
	protected PageData<T> createPageTool(int currentPageNo,int count){

		PageData<T> page = new PageData<T>(currentPageNo,count);
		return page;
	}
	
	
	/**
	 * 读取数据
	 * @param map 
	 * @return
	 */
	protected List<T> loadData(Map<String,Object> map){
		if(function == null) {
			return null;
		}else {
			return function.find(map);
		}
	}
	
	
}