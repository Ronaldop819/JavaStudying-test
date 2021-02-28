package com.test.demo.service;


import org.springframework.beans.factory.annotation.Autowired;

import com.test.demo.datasource.model.Nutritionist;
import com.test.demo.repository.NutritionistRepository;

public class RegisterNutritionist {

	@Autowired
	private NutritionistRepository nutritionistRepository;
	
	public void register(Nutritionist nutritionist) {
		nutritionistRepository.saveAndFlush(nutritionist);
		
	}
}
