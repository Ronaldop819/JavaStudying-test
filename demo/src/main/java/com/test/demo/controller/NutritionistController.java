package com.test.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NutritionistController {

	@GetMapping(path = "api/nutricionista-id/{}")
	public void searchNutritionistForId() {
		
	}
	
}
