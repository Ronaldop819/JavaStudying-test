package com.test.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.datasource.model.Nutritionist;
import com.test.demo.repository.NutritionistRepository;

@RestController
public class NutritionistController {

	@Autowired
	private NutritionistRepository nutritionistRepository;
	
	@GetMapping(path = "api/nutricionista-id/{}")
	public ResponseEntity<Optional<Nutritionist>> searchNutritionistForId(@PathVariable (name = "id", required = true)Long idNutritionist) {
		return ResponseEntity.ok(nutritionistRepository.findById(idNutritionist));
		
	}
	
}
