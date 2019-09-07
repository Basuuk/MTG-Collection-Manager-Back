package com.nlc.collection.service.mysql.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.nlc.collection.repository.mysql.CardRepository;
import com.nlc.collection.repository.mysql.entity.Card;
import com.nlc.collection.service.mysql.CardService;

@Service(value = "com.nlc.collection.service.mysql.impl.CardServiceImpl")
public class CardServiceImpl implements CardService {

	@Autowired
	private CardRepository repository;

	@Override
	public Page<Card> findAll(Integer page, Integer size) {
		return repository.findAll(PageRequest.of(page, size));
	}

}
