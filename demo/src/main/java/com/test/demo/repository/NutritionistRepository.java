package com.test.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.demo.datasource.model.Nutritionist;

public interface NutritionistRepository extends JpaRepository<Nutritionist, Long> {

}
