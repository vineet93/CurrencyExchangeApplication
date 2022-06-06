package com.in28minutes.microservices.currencyexchangeservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircuitBreakerController {
	
	@GetMapping("/sample")
	public String sampleApi() {
		
		return "SampleApi";
		
	}

}
