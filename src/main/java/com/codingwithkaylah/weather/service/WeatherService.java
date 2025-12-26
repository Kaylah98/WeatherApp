package com.codingwithkaylah.weather.service;


import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


import com.codingwithkaylah.weather.exceptions.LocationNotFoundException;
import com.codingwithkaylah.weather.weathermodel.WeatherData;
import com.codingwithkaylah.weather.weathermodel.WeatherRequest;

import reactor.core.publisher.Mono;



@Service
public class WeatherService {

	private WebClient webClient;
	
	
	private String apikey = System.getenv("API_KEY");
	
	public WeatherService(WebClient.Builder webClientBuilder) {
		
		this.webClient = webClientBuilder.baseUrl("http://api.weatherapi.com/v1").build();
	
	}
	
	// This method makes an API call to the weatherapi and gets the location's weather data
	public WeatherData getCurrentWeather(WeatherRequest weatherRequest) {
	
				// WebClient retrieves current weather for the location and stores it in WeatherData
				Mono<WeatherData> weather = webClient.get().uri("/current.json?key=" + apikey + "&q=" + weatherRequest.getCityName() 
				+ ", " + weatherRequest.getRegion() + ", " + weatherRequest.getCountry())
						.retrieve().bodyToMono(WeatherData.class);
				
				// Gets the result
				WeatherData weatherData = weather.block();
				
				
				if (weatherData == null) {
					throw new LocationNotFoundException("location: " + weatherRequest.getCityName() + " cannot be found");
				}
				
				return weatherData;
	
	}
	
	
	
	}
	
	
			

