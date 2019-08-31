package com.nlc.collection.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nlc.collection.repository.entity.Card;

public interface CardRepository extends MongoRepository<Card, String> {

}
