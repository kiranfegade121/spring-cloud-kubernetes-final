package com.training.currencyexchangeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.currencyexchangeservice.model.ExchangeValue;
import com.training.currencyexchangeservice.repository.ExchangeValueRepository;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private ExchangeValueRepository exchangeValueRepository;

	@GetMapping("/api/v1/currency-exchange/from/{from}/to/{to}")
	public ResponseEntity<ExchangeValue> getCurrencyExchangeValue(@PathVariable String from, @PathVariable String to) {
			
		ExchangeValue exchangeValue = exchangeValueRepository.findByFromAndTo(from, to);
		return new ResponseEntity<ExchangeValue>(exchangeValue, HttpStatus.OK);
	}
}



















