package com.nlc.collection.repository.mysql;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.nlc.collection.repository.mysql.entity.Card;
import com.nlc.collection.repository.mysql.entity.CardPK;

@Repository(value = "com.nlc.collection.repository.mysql.CardRepository")
public interface CardRepository extends PagingAndSortingRepository<Card, CardPK> {

}
