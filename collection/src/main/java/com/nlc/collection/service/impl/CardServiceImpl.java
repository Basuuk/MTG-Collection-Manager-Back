package com.nlc.collection.service.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.mongodb.BasicDBObject;
import com.nlc.collection.repository.CardRepository;
import com.nlc.collection.repository.entity.Card;
import com.nlc.collection.service.CardService;

@Service
public class CardServiceImpl implements CardService {

	@Autowired
	private CardRepository repository;

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public Page<Card> findAll() {
		return repository.findAll(PageRequest.of(0, 10));
	}

	@Override
	public Card create(Card card) {
		return repository.save(card);
	}

	@Override
	public void readFile() {
		try (BufferedReader br = new BufferedReader(new FileReader("E:\\Basuuk\\Downloads\\omnath-ugly.json"))) {
			String line;
			while ((line = br.readLine()) != null) {
				BasicDBObject c = BasicDBObject.parse(line);
				Card ca = mongoTemplate.getConverter().read(Card.class, c);
				repository.save(ca);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
