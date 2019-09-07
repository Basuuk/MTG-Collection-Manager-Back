package com.nlc.collection.service.mysql.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.nlc.collection.repository.mysql.PlayerRepository;
import com.nlc.collection.repository.mysql.entity.Player;
import com.nlc.collection.service.mysql.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private PlayerRepository repository;

	@Override
	public Page<Player> findAll(Integer page, Integer size) {
		return repository.findAll(PageRequest.of(page, size));
	}

}
