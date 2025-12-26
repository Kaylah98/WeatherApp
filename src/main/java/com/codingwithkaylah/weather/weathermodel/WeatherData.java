package com.codingwithkaylah.weather.weathermodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherData {
	
	@JsonProperty("location")
	private Location location;
	@JsonProperty("current")
	private Current current;
	
	
	public WeatherData(Location location, Current current) {
		super();
		this.location = location;
		this.current = current;
		
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Current getCurrent() {
		return current;
	}

	public void setCurrent(Current current) {
		this.current = current;
	}

}
