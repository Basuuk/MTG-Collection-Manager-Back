package com.nlc.collection.service.mongo.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.BasicDBObject;
import com.nlc.collection.repository.mongo.CardRepository;
import com.nlc.collection.repository.mongo.entity.Card;
import com.nlc.collection.service.mongo.CardService;

@Service
public class CardServiceImpl implements CardService {

	@Autowired
	private CardRepository repository;

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public Page<Card> findAll(Integer page, Integer size) {
		return repository.findAll(PageRequest.of(page, size));
	}

	@Override
	public Card create(Card card) {
		return repository.save(card);
	}

	@Override
	public void splitFile() {
		try (BufferedReader br = new BufferedReader(new FileReader("E:\\Basuuk\\Downloads\\scryfall-default-cards.json"))) {
			ObjectMapper m = new ObjectMapper();
			JsonNode j = m.readValue(br, JsonNode.class);
			int count = 1;
			for (JsonNode js : j) {
				new ObjectMapper().writeValue(new File("E:\\Basuuk\\Downloads\\cards\\card-" + count + ".json"), js);
				count++;
			}
			System.out.println("FINISHED");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void readAllFiles() {
		for (File f : new File("E:\\Basuuk\\Downloads\\cards").listFiles()) {
			try (BufferedReader br = new BufferedReader(new FileReader(f))) {
				String line;
				while ((line = br.readLine()) != null) {
					repository.save(mongoTemplate.getConverter().read(Card.class, BasicDBObject.parse(line)));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("FINISHED");
	}

}
