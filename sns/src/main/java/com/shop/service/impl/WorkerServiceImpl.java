package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.WorkerMapper;
import com.shop.pojo.Worker;
import com.shop.service.WorkerService;

@Service("workerService")
public class WorkerServiceImpl implements WorkerService{

	@Autowired
	private WorkerMapper workerMapper;
	
	public int addWorker(Worker worker) {
		return workerMapper.insertSelective(worker);
	}

	@Override
	public List<Worker> queryWorkerList() {
		return workerMapper.selectWorkerInfo();
	}

}
