package com.nlc.collection.service.mysql;

import org.springframework.data.domain.Page;

import com.nlc.collection.repository.mysql.entity.Card;

public interface CardService {

	Page<Card> findAll(Integer page, Integer size);

}
