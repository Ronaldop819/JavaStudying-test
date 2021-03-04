package com.newt.service;

import lombok.Data;

@Data
public class Greeting {

	private final Long id;
	private final String name;
	private final String office;
	
	public Greeting(Long id, String name, String office) {
		this.id = id;
		this.name = name;
		this.office = office;
	}
	

	
}
