package com.codingwithkaylah.weathermodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {
	
	@JsonProperty("name")
	private String cityName;
	
	@JsonProperty("region")
	private String region;
	
	@JsonProperty("country")
	private String country;

	
	public Location(String cityName, String region, String country) {
		super();
		this.cityName = cityName;
		this.region = region;
		this.country = country;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
	
	
}
