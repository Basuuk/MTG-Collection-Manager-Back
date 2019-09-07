package com.nlc.collection.controller.mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nlc.collection.repository.mysql.entity.Player;
import com.nlc.collection.service.mysql.PlayerService;

@RestController
@CrossOrigin
public class PlayerController {

	@Autowired
	private PlayerService service;

	@GetMapping(value = "/players")
	public Page<Player> findAll(@RequestParam(value = "page", defaultValue = "0", required = false) Integer page, @RequestParam(value = "size", defaultValue = "10", required = false) Integer size) {
		return service.findAll(page, size);
	}

}
