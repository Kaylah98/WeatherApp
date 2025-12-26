package com.codingwithkaylah.weather.weathermodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Current {

	@JsonProperty("temp_f")
	private double temperatureF;
	
	@JsonProperty("temp_c")
	private double temperatureC;
	
	@JsonProperty("condition")
	private Condition condition;
	
	@JsonProperty("wind_mph")
	private double windMph;
	
	@JsonProperty("wind_kph")
	private double windKph;
	
	@JsonProperty("feelslike_f")
	private double feelsLikeF;
	
	@JsonProperty("feelslike_c")
	private double feelsLikeC;
	
	private int humidity;
	
	public Current(double temperatureF, double temperatureC, Condition condition, double windMph, double windKph,
			double feelsLikeF, double feelsLikeC, int humidity) {
		super();
		this.temperatureF = temperatureF;
		this.temperatureC = temperatureC;
		this.condition = condition;
		this.windMph = windMph;
		this.windKph = windKph;
		this.feelsLikeF = feelsLikeF;
		this.feelsLikeC = feelsLikeC;
		this.humidity = humidity;
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

	public double getWindMph() {
		return windMph;
	}

	public void setWindMph(double windMph) {
		this.windMph = windMph;
	}

	public double getWindKph() {
		return windKph;
	}

	public void setWindKph(double windKph) {
		this.windKph = windKph;
	}

	public double getFeelsLikeF() {
		return feelsLikeF;
	}

	public void setFeelsLikeF(double feelsLikeF) {
		this.feelsLikeF = feelsLikeF;
	}

	public double getFeelsLikeC() {
		return feelsLikeC;
	}

	public void setFeelsLikeC(double feelsLikeC) {
		this.feelsLikeC = feelsLikeC;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	
	
	
}
