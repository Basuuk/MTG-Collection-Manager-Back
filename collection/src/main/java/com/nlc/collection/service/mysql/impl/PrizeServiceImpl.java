package com.nlc.collection.service.mysql.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.nlc.collection.repository.mysql.PrizeRepository;
import com.nlc.collection.repository.mysql.entity.Prize;
import com.nlc.collection.service.mysql.PrizeService;

@Service
public class PrizeServiceImpl implements PrizeService {

	@Autowired
	private PrizeRepository repository;

	@Override
	public Page<Prize> findAll(Integer page, Integer size) {
		return repository.findAll(PageRequest.of(page, size));
	}

}
