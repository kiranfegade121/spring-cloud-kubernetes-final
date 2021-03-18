package com.training.currencyconversionservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.training.currencyconversionservice.model.CurrencyConversion;
import com.training.currencyconversionservice.model.ExchangeValue;

@RestController
public class CurrencyConversionController {
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/api/v1/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public ResponseEntity<CurrencyConversion> convertCurrency(@PathVariable String from, @PathVariable String to, @PathVariable int quantity) {
		
		String url = "http://currency-exchange-service:8082/api/v1/currency-exchange/from/" + from + "/to/" + to;
		
		ExchangeValue exchangeValue = restTemplate.getForEntity(url, ExchangeValue.class).getBody();
		double finalAmount = exchangeValue.getValue() * quantity;
		CurrencyConversion currencyConversion = new CurrencyConversion(exchangeValue.getId(), from, to, exchangeValue.getValue(), quantity);
		currencyConversion.setFinalAmount(finalAmount);
		
		return new ResponseEntity<CurrencyConversion>(currencyConversion, HttpStatus.OK);
	}
}
