package com.nlc.collection.service;

import org.springframework.data.domain.Page;

import com.nlc.collection.repository.entity.Card;

public interface CardService {

	Page<Card> findAll();

	Card create(Card card);

	void readFile();
}
