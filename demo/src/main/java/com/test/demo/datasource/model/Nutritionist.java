package com.test.demo.datasource.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "nutricionista")
public class Nutritionist {

	@Id
	private Long id;
	
	private String name;
	private LocalDate age;
	
	@Column(name = "codigo_registro")
	private String codeRegister;
	
	@Column(name = "id_patient")
	private Long idPatient;
	
	
	public Nutritionist(String name, LocalDate age, String codeRegister, Long id_paciente) {
		this.name = name;
		this.age = age;
		this.codeRegister = codeRegister;
		this.idPatient = id_paciente;
	}
	
	@SuppressWarnings("unused")
	private Nutritionist() {
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getAge() {
		return age;
	}
	public void setAge(LocalDate age) {
		this.age = age;
	}
	public String getCodeRegister() {
		return codeRegister;
	}
	public void setCodeRegister(String codeRegister) {
		this.codeRegister = codeRegister;
	}
	public Long getId_paciente() {
		return idPatient;
	}
	public void setId_paciente(Long id_paciente) {
		this.idPatient = id_paciente;
	}
	
	
	
}
