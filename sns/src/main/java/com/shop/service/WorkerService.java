package com.shop.service;

import java.util.List;

import com.shop.pojo.Worker;

public interface WorkerService {

	/**
	 * 添加内部人员
	 * @param worker
	 * @return
	 */
	int addWorker(Worker worker);
	
	/**
	 * 查询内部人员信息
	 * @return
	 */
	List<Worker> queryWorkerList();
}
