package com.nlc.collection.repository.mysql;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nlc.collection.repository.mysql.entity.TournamentRound;
import com.nlc.collection.repository.mysql.entity.TournamentRoundPK;

public interface TournamentRoundRepository extends PagingAndSortingRepository<TournamentRound, TournamentRoundPK> {

	List<TournamentRound> findByIdIdTournament(Integer tournamentId);

	List<TournamentRound> findByIdIdTournamentAndPlayer1Id(Integer tournamentId, Integer playerId);

}
