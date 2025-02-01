package com.codingwithkaylah.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import com.codingwithkaylah.weathermodel.WeatherData;
import reactor.core.publisher.Mono;



@Service
public class WeatherService {

	private WebClient webClient;
	
	
	private String apikey = System.getenv("API_KEY");
	
	
	
	
	public WeatherService(WebClient.Builder webClientBuilder) {
		
		this.webClient = webClientBuilder.baseUrl("http://api.weatherapi.com/v1").build();
	
	}
	
	// This method makes an API call to the weatherapi and gets the location's weather data
	public WeatherData getCurrentWeather(String cityName, String region, String country) throws Exception {
	
				
				
				// WebClient retrieves current weather for the location and stores it in WeatherData
				Mono<WeatherData> weather = webClient.get().uri("/current.json?key=" + apikey + "&q=" + cityName 
				+ ", " + region + ", " + country)
						.retrieve().bodyToMono(WeatherData.class);
				
				// Gets the result
				WeatherData weatherData = weather.block();
				
				// Throws exception if city name, region and country are null
				if (weatherData.getLocation().getCityName() == null 
					&& weatherData.getLocation().getRegion() == null && weatherData.getLocation().getCountry() == null) {
					throw new Exception();
				}
				
				
				return weatherData;
			}
	
}
			
			

	
	

