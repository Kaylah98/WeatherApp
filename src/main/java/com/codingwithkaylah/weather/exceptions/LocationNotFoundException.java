package com.codingwithkaylah.weather.exceptions;

public class LocationNotFoundException extends RuntimeException{

	
	public LocationNotFoundException(String message) {
		super(message);
		System.out.println(message);
	}
		
		
	}
