package com.codingwithkaylah.weathercontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.codingwithkaylah.service.WeatherService;
import com.codingwithkaylah.weathermodel.WeatherData;



@Controller
public class WeatherController {
	
	
	private final WeatherService weatherService;
	
	public WeatherController(WeatherService weatherService) {
		this.weatherService = weatherService;
	}
	
	// Returns a search page to enter location
	@GetMapping("/weather")
	public String getSearchPage() {
		
		return "search";
	}
	
	@GetMapping("/weather/results")
	public String getWeather(@RequestParam String cityName, @RequestParam String country, @RequestParam String region,
			Model model) {
		
		try {
			
		// Gets the current weather
		WeatherData weather = weatherService.getCurrentWeather(cityName, region, country);
			
		// Stores status in string
		String currentStatus = weather.getTemperature().getCondition().getStatus();
		
		// Sends weather data to view 
		model.addAttribute("weatherData", weather);
		
		// Returns page depending on status
		if (currentStatus.contains("Rain") || currentStatus.contains("Drizzle")) {
			return "rainy";
		}
		else if (currentStatus.contains("Cloudy") || currentStatus.contains("Overcast")
				|| currentStatus.contains("Partly cloudy")) {
			return "cloudy";
		}
		else if (currentStatus.contains("Clear") || currentStatus.contains("Sunny")) {
			return "sunny";
		}
		else if (currentStatus.contains("Snow") || currentStatus.contains("Ice") || currentStatus.contains("Sleet")
		|| currentStatus.contains("Blizzard")) {
			return "snowy";
		}
		// Returns default page if none of the statuses are true
		else {
			return "default";
		}
		
		}
		// Returns not found page if location is not found
		catch(Exception e) {
			return "notFound";
		}
		
		
	}
	
	
}
