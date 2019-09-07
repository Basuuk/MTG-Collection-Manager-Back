package com.nlc.collection.repository.mysql;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nlc.collection.repository.mysql.entity.Tournament;

public interface TournamentRepository extends PagingAndSortingRepository<Tournament, Integer> {

}
