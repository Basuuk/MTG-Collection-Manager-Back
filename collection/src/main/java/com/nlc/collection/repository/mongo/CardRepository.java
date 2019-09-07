package com.nlc.collection.repository.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nlc.collection.repository.mongo.entity.Card;

public interface CardRepository extends MongoRepository<Card, String> {

}
