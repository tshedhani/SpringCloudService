package com.example.client.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

	 @Value("${service.minimum}")
	 Integer min;
	
	 @Value("${service.maximum}")
	 Integer max;
	 
	 @GetMapping("/getLimits")
	 public String getLimits() {
		 
		 return "Minimum = " + min + " | Maximum = " + max;
	 }
}
