package com.nlc.collection.service.mysql.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.nlc.collection.exception.MtgCollectionException;
import com.nlc.collection.repository.mysql.DeckRepository;
import com.nlc.collection.repository.mysql.FormatRepository;
import com.nlc.collection.repository.mysql.entity.Deck;
import com.nlc.collection.repository.mysql.entity.Format;
import com.nlc.collection.service.mysql.DeckService;

@Service
public class DeckServiceImpl implements DeckService {

	@Autowired
	private DeckRepository repository;

	@Autowired
	private FormatRepository fRepository;

	@Override
	public Page<Deck> findAll(Integer page, Integer size) {
		return repository.findAll(PageRequest.of(page, size));
	}

	@Override
	public Deck save(String deck, Integer format) {
		Format f = fRepository.findById(format).orElseThrow(() -> new MtgCollectionException("El formato especificado no existe"));
		return repository.save(new Deck(null, deck, f));
	}

}
