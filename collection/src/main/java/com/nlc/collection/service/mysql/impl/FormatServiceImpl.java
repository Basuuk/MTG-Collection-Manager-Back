package com.nlc.collection.service.mysql.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.nlc.collection.repository.mysql.FormatRepository;
import com.nlc.collection.repository.mysql.entity.Format;
import com.nlc.collection.service.mysql.FormatService;

@Service
public class FormatServiceImpl implements FormatService {

	@Autowired
	private FormatRepository repository;

	@Override
	public Page<Format> findAll(Integer page, Integer size) {
		return repository.findAll(PageRequest.of(page, size));
	}

}
