package com.nlc.collection.controller.mysql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nlc.collection.repository.mysql.entity.TournamentRound;
import com.nlc.collection.service.mysql.TournamentRoundService;

@RestController
@CrossOrigin
public class TournamentRoundController {

	@Autowired
	private TournamentRoundService service;

	@GetMapping(value = "/rounds")
	public List<TournamentRound> findByIdIdTournament(@RequestParam(value = "tournamentId", required = true) Integer tournamentId) {
		return service.findByIdIdTournament(tournamentId);
	}

	@GetMapping(value = "/player-rounds")
	public List<TournamentRound> findByIdIdTournamentAndPlayer1Id(@RequestParam(value = "tournamentId", required = true) Integer tournamentId, @RequestParam(value = "playerId", required = true) Integer playerId) {
		return service.findByIdIdTournamentAndPlayer1Id(tournamentId, playerId);
	}

	@PostMapping(value = "/rounds")
	public TournamentRound save(@RequestBody TournamentRound tR) {
		return service.save(tR);
	}

}
