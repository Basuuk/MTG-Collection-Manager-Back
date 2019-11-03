package com.nlc.collection.service.mysql;

import java.util.List;

import com.nlc.collection.repository.mysql.entity.PlayerDeckTournament;

public interface PlayerDeckTournamentService {

	List<PlayerDeckTournament> findByIdIdTournament(Integer tournamentId);

	List<PlayerDeckTournament> findByIdIdTournamentAndIdIdPlayer(Integer tournamentId, Integer playerId);

	List<PlayerDeckTournament> findByIdIdPlayer(Integer playerId);

	List<PlayerDeckTournament> findAll();

	PlayerDeckTournament save(PlayerDeckTournament pDT);

}
