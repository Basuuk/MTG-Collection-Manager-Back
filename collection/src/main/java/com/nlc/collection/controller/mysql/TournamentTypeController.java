package com.nlc.collection.controller.mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nlc.collection.repository.mysql.entity.TournamentType;
import com.nlc.collection.service.mysql.TournamentTypeService;

@RestController
@CrossOrigin
public class TournamentTypeController {

	@Autowired
	private TournamentTypeService service;

	@GetMapping(value = "/types")
	public Page<TournamentType> findAll(@RequestParam(value = "page", defaultValue = "0", required = false) Integer page, @RequestParam(value = "size", defaultValue = "2147483647", required = false) Integer size) {
		return service.findAll(page, size);
	}

}
