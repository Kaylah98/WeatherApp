package com.codingwithkaylah.weather.weathermodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Condition {

	@JsonProperty("text")
	private String status;

	
	public Condition(String status) {
		super();
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
