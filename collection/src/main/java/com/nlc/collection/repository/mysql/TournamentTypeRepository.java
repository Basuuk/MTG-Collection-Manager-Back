package com.nlc.collection.repository.mysql;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nlc.collection.repository.mysql.entity.TournamentType;

public interface TournamentTypeRepository extends PagingAndSortingRepository<TournamentType, Integer> {

}
