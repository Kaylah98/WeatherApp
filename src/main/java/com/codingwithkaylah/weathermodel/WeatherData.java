package com.codingwithkaylah.weathermodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherData {
	
	// Json value gets stored into this attribute
	@JsonProperty("location")
	private Location location;

	@JsonProperty("current")
	private Temperature temperature;
	
	
	public WeatherData(Location location, Temperature temperature) {
		super();
		this.location = location;
		this.temperature = temperature;
		
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Temperature getTemperature() {
		return temperature;
	}

	public void setTemperature(Temperature temperature) {
		this.temperature = temperature;
	}

}
