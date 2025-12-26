package com.codingwithkaylah.weather.weathercontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.codingwithkaylah.weather.exceptions.LocationNotFoundException;
import com.codingwithkaylah.weather.service.WeatherService;
import com.codingwithkaylah.weather.weathermodel.WeatherData;
import com.codingwithkaylah.weather.weathermodel.WeatherRequest;


@Controller
public class WeatherController {
	
	
	private final WeatherService weatherService;
	
	public WeatherController(WeatherService weatherService) {
		this.weatherService = weatherService;
	}
	
	// Returns a search page to enter location
	@GetMapping("/weather")
	public String getSearchPage(Model model) {
		model.addAttribute("weatherRequest", new WeatherRequest());
		return "search";
	}
	
	@PostMapping("/weather/results")
	public String getWeather(@ModelAttribute WeatherRequest weatherRequest,
			Model model) throws LocationNotFoundException {
	
		// Gets the current weather
		WeatherData weather = weatherService.getCurrentWeather(weatherRequest);

		// Sends weather data to view 
		model.addAttribute("weatherData", weather);
		
		return "default";
}
	
	
	}

