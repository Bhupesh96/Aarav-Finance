package com.finance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.finance.entity.Apply;
import com.finance.repo.ApplyRepo;

@Service
public class ApplyServiceImpl implements ApplyService {

	@Autowired
	private ApplyRepo repo;
	
	@Override
	public Apply saveApp(Apply apply) {
		Apply newApply = repo.save(apply);
		return newApply;
	}


}
