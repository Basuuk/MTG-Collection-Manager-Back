package com.nlc.collection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nlc.collection.repository.entity.Card;
import com.nlc.collection.service.CardService;

@RestController
public class CardController {

	@Autowired
	private CardService service;

	@GetMapping(value = "/cards")
	public Page<Card> findAll(@RequestParam(value = "page", defaultValue = "0", required = false) Integer page, @RequestParam(value = "size", defaultValue = "10", required = false) Integer size) {
		return service.findAll(page, size);
	}

	@PostMapping(value = "/cards")
	public Card create(@RequestBody Card card) {
		return service.create(card);
	}

	@PostMapping(value = "/cards-split-file")
	public void splitFile() {
		service.splitFile();
	}

	@PostMapping(value = "/read-card-files")
	public void readAllFiles() {
		service.readAllFiles();
	}

}
