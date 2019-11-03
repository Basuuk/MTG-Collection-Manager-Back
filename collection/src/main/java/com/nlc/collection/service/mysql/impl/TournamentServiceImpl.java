package com.nlc.collection.service.mysql.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.nlc.collection.exception.MtgCollectionException;
import com.nlc.collection.repository.mysql.TournamentRepository;
import com.nlc.collection.repository.mysql.TournamentTypeRepository;
import com.nlc.collection.repository.mysql.entity.Tournament;
import com.nlc.collection.repository.mysql.entity.TournamentType;
import com.nlc.collection.service.mysql.TournamentService;

@Service
public class TournamentServiceImpl implements TournamentService {

	@Autowired
	private TournamentRepository repository;

	@Autowired
	private TournamentTypeRepository tRepository;

	@Override
	public Page<Tournament> findAll(Integer page, Integer size) {
		return repository.findAll(PageRequest.of(page, size));
	}

	@Override
	public Tournament save(ObjectNode tournament) throws ParseException {
		Tournament t = new Tournament();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String df = sdf.format(new Date(tournament.get("date").asLong()));
		t.setComments(tournament.get("comments").asText());
		t.setDate(sdf.parse(df));
		t.setLocation(tournament.get("location").asText());
		t.setTitle(tournament.get("title").asText());
		TournamentType type = tRepository.findById(tournament.get("type").asInt()).orElseThrow(() -> new MtgCollectionException("El tipo de torneo indicado no existe"));
		t.setType(type);
		return repository.save(t);
	}

	@Override
	public void fullSave(ObjectNode tournamentReport) {
		System.out.println(tournamentReport.asText());
	}

}
