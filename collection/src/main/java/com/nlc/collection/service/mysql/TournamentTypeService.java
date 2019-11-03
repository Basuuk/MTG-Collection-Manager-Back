package com.nlc.collection.service.mysql;

import org.springframework.data.domain.Page;

import com.nlc.collection.repository.mysql.entity.TournamentType;

public interface TournamentTypeService {

	Page<TournamentType> findAll(Integer page, Integer size);

}
