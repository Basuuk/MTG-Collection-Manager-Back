package com.nlc.collection.service.mysql;

import org.springframework.data.domain.Page;

import com.nlc.collection.repository.mysql.entity.Player;

public interface PlayerService {

	Page<Player> findAll(Integer page, Integer size);

}
