package com.nlc.collection.repository.mysql;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nlc.collection.repository.mysql.entity.PlayerDeckTournament;
import com.nlc.collection.repository.mysql.entity.PlayerDeckTournamentPK;

public interface PlayerDeckTournamentRepository extends PagingAndSortingRepository<PlayerDeckTournament, PlayerDeckTournamentPK> {

	List<PlayerDeckTournament> findByIdIdTournament(Integer tournamentId);

	List<PlayerDeckTournament> findByIdIdTournamentAndIdIdPlayer(Integer tournamentId, Integer playerId);

	List<PlayerDeckTournament> findByIdIdPlayer(Integer playerId);

	@Override
	List<PlayerDeckTournament> findAll();

}
