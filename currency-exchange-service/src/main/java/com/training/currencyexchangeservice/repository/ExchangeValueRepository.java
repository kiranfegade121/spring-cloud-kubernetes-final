package com.training.currencyexchangeservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.training.currencyexchangeservice.model.ExchangeValue;

public interface ExchangeValueRepository extends MongoRepository<ExchangeValue, Integer> {
	
	public ExchangeValue findByFromAndTo(String from, String to);
}
