package com.nlc.collection.repository.mysql;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nlc.collection.repository.mysql.entity.Player;

public interface PlayerRepository extends PagingAndSortingRepository<Player, Integer> {

}
