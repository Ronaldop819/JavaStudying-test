package com.test.demo.resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NutritionistResource {

	@JsonProperty("name_nutritionist")
	private String name;
	
	@JsonProperty("name_idPatient2")
	private String idPaciente;
	
	
	

	public void setIdPaciente(String idPaciente) {
		this.idPaciente = idPaciente;
	}


	public NutritionistResource(String name, String idPaciente) {
		this.name = name;
		this.idPaciente = idPaciente;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getIdPaciente() {
		return idPaciente;
	}


	
	
	
}
