package com.nlc.collection.service.mysql.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nlc.collection.repository.mysql.TournamentRoundRepository;
import com.nlc.collection.repository.mysql.entity.TournamentRound;
import com.nlc.collection.service.mysql.TournamentRoundService;

@Service
public class TournamentRoundServiceImpl implements TournamentRoundService {

	@Autowired
	private TournamentRoundRepository repository;

	@Override
	public List<TournamentRound> findByIdIdTournament(Integer tournamentId) {
		return repository.findByIdIdTournament(tournamentId);
	}

	@Override
	public List<TournamentRound> findByIdIdTournamentAndPlayer1Id(Integer tournamentId, Integer playerId) {
		return repository.findByIdIdTournamentAndPlayer1Id(tournamentId, playerId);
	}

	@Override
	public TournamentRound save(TournamentRound tR) {
		return repository.save(tR);
	}

}
