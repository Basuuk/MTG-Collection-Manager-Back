package com.nlc.collection.repository.mysql;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nlc.collection.repository.mysql.entity.Deck;

public interface DeckRepository extends PagingAndSortingRepository<Deck, Integer> {

}
