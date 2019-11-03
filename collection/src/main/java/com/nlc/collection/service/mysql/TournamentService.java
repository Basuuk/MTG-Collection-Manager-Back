package com.nlc.collection.service.mysql;

import java.text.ParseException;

import org.springframework.data.domain.Page;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.nlc.collection.repository.mysql.entity.Tournament;

public interface TournamentService {

	Page<Tournament> findAll(Integer page, Integer size);

	Tournament save(ObjectNode tournament) throws ParseException;

	void fullSave(ObjectNode tournamentReport);
}
