package com.nlc.collection.service.mysql;

import org.springframework.data.domain.Page;

import com.nlc.collection.repository.mysql.entity.Deck;

public interface DeckService {

	Page<Deck> findAll(Integer page, Integer size);

	Deck save(String deck, Integer format);

}
