package com.nlc.collection.service.mysql.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nlc.collection.repository.mysql.PlayerDeckTournamentRepository;
import com.nlc.collection.repository.mysql.entity.PlayerDeckTournament;
import com.nlc.collection.service.mysql.PlayerDeckTournamentService;

@Service
public class PlayerDeckTournamentServiceImpl implements PlayerDeckTournamentService {

	@Autowired
	private PlayerDeckTournamentRepository repository;

	@Override
	public List<PlayerDeckTournament> findByIdIdTournament(Integer tournamentId) {
		return repository.findByIdIdTournament(tournamentId);
	}

	@Override
	public List<PlayerDeckTournament> findByIdIdTournamentAndIdIdPlayer(Integer tournamentId, Integer playerId) {
		return repository.findByIdIdTournamentAndIdIdPlayer(tournamentId, playerId);
	}

	@Override
	public List<PlayerDeckTournament> findByIdIdPlayer(Integer playerId) {
		return repository.findByIdIdPlayer(playerId);
	}

	@Override
	public List<PlayerDeckTournament> findAll() {
		return repository.findAll();
	}

	@Override
	public PlayerDeckTournament save(PlayerDeckTournament pDT) {
		return repository.save(pDT);
	}
}
