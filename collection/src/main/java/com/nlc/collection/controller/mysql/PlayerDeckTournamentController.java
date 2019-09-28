package com.nlc.collection.controller.mysql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nlc.collection.repository.mysql.entity.PlayerDeckTournament;
import com.nlc.collection.service.mysql.PlayerDeckTournamentService;

@RestController
@CrossOrigin
public class PlayerDeckTournamentController {

	@Autowired
	private PlayerDeckTournamentService service;

	@GetMapping(value = "/pdt")
	public List<PlayerDeckTournament> findByTournament(@RequestParam(value = "tournamentId", required = true) Integer tournamentId) {
		return service.findByIdIdTournament(tournamentId);
	}

	@GetMapping(value = "/playerPdt")
	public List<PlayerDeckTournament> findByTournamentAndPlayer(@RequestParam(value = "tournamentId", required = true) Integer tournamentId, @RequestParam(value = "playerId", required = true) Integer playerId) {
		return service.findByIdIdTournamentAndIdIdPlayer(tournamentId, playerId);
	}

	@GetMapping(value = "/onlyPlayerPdt")
	public List<PlayerDeckTournament> findByPlayer(@RequestParam(value = "playerId", required = true) Integer playerId) {
		return service.findByIdIdPlayer(playerId);
	}

	@GetMapping(value = "/pdts")
	public List<PlayerDeckTournament> findAll() {
		return service.findAll();
	}

}
