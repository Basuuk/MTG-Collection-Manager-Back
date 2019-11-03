package com.nlc.collection.service.mysql.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.nlc.collection.repository.mysql.TournamentTypeRepository;
import com.nlc.collection.repository.mysql.entity.TournamentType;
import com.nlc.collection.service.mysql.TournamentTypeService;

@Service
public class TournamentTypeServiceImpl implements TournamentTypeService {

	@Autowired
	private TournamentTypeRepository repository;

	@Override
	public Page<TournamentType> findAll(Integer page, Integer size) {
		return repository.findAll(PageRequest.of(page, size));
	}

}
