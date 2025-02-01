package com.codingwithkaylah.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.codingwithkaylah.weathercontroller", "com.codingwithkaylah.service", 
		 "com.codingwithkaylah.weathermodel"})
public class WeatherProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherProjectApplication.class, args);
	}

}
