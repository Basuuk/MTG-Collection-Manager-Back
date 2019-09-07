package com.nlc.collection.service.mongo;

import org.springframework.data.domain.Page;

import com.nlc.collection.repository.mongo.entity.Card;

public interface CardService {

	Page<Card> findAll(Integer page, Integer size);

	Card create(Card card);

	void splitFile();

	void readAllFiles();
}
