package com.nlc.collection.service.mysql.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.nlc.collection.repository.mysql.DeckRepository;
import com.nlc.collection.repository.mysql.entity.Deck;
import com.nlc.collection.service.mysql.DeckService;

@Service
public class DeckServiceImpl implements DeckService {

	@Autowired
	private DeckRepository repository;

	@Override
	public Page<Deck> findAll(Integer page, Integer size) {
		return repository.findAll(PageRequest.of(page, size));
	}

}
