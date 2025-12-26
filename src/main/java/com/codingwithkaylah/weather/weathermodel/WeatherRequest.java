package com.codingwithkaylah.weather.weathermodel;

public class WeatherRequest {

	
	private String cityName;
	
	
	private String region;
	
	
	private String country;
	
	public WeatherRequest(String cityName, String region, String country) {
		this.cityName = cityName;
		this.region = region;
		this.country = country;
	}
	
	public WeatherRequest() {
		
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
