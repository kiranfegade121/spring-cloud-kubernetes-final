package com.training.currencyconversionservice.model;

public class ExchangeValue {

	private int id;
	private String from;
	private String to;
	private double value;

	public ExchangeValue() {
		super();
	}

	public ExchangeValue(int id, String from, String to, double value) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.value = value;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

}
