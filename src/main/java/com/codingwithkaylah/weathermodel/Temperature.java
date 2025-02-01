package com.codingwithkaylah.weathermodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Temperature {

	@JsonProperty("temp_f")
	private double temperatureF;
	
	@JsonProperty("temp_c")
	private double temperatureC;
	
	@JsonProperty("condition")
	private Condition condition;

	
	
	public Temperature(double temperatureF, double temperatureC, Condition condition) {
		super();
		this.temperatureF = temperatureF;
		this.temperatureC = temperatureC;
		this.condition = condition;
	}

	public double getTemperatureF() {
		return temperatureF;
	}

	public void setTemperatureF(double temperatureF) {
		this.temperatureF = temperatureF;
	}

	public double getTemperatureC() {
		return temperatureC;
	}

	public void setTemperatureC(double temperatureC) {
		this.temperatureC = temperatureC;
	}

	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}
	
	
}
