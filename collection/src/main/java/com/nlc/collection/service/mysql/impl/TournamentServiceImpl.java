package com.nlc.collection.service.mysql.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.nlc.collection.repository.mysql.TournamentRepository;
import com.nlc.collection.repository.mysql.entity.Tournament;
import com.nlc.collection.service.mysql.TournamentService;

@Service
public class TournamentServiceImpl implements TournamentService {

	@Autowired
	private TournamentRepository repository;

	@Override
	public Page<Tournament> findAll(Integer page, Integer size) {
		return repository.findAll(PageRequest.of(page, size));
	}

}
