package com.nlc.collection.service.mysql;

import java.util.List;

import com.nlc.collection.repository.mysql.entity.TournamentRound;

public interface TournamentRoundService {

	List<TournamentRound> findByIdIdTournament(Integer tournamentId);

}
