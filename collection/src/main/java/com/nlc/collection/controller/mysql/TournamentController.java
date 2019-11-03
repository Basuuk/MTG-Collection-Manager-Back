package com.nlc.collection.controller.mysql;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.nlc.collection.repository.mysql.entity.Tournament;
import com.nlc.collection.service.mysql.TournamentService;

@RestController
@CrossOrigin
public class TournamentController {

	@Autowired
	private TournamentService service;

	@GetMapping(value = "/tournaments")
	public Page<Tournament> findAll(@RequestParam(value = "page", defaultValue = "0", required = false) Integer page, @RequestParam(value = "size", defaultValue = "10", required = false) Integer size) {
		return service.findAll(page, size);
	}

	@PostMapping(value = "/tournaments")
	public Tournament save(@RequestBody ObjectNode tournament) throws ParseException {
		return service.save(tournament);
	}

	@PostMapping(value = "/tournaments-full")
	public void fullSave(@RequestBody ObjectNode tournamentReport) {
		service.fullSave(tournamentReport);
	}

}
