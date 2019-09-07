package com.nlc.collection.service.mysql;

import org.springframework.data.domain.Page;

import com.nlc.collection.repository.mysql.entity.Tournament;

public interface TournamentService {

	Page<Tournament> findAll(Integer page, Integer size);

}
