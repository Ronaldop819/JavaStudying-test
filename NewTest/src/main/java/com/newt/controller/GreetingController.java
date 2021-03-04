package com.newt.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.newt.service.Greeting;

@RestController
public class GreetingController {

	private static final String template = "Maria";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "Secretary") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name), name);
	}

	@PostMapping(consumes = "application/json", produces = "application/json")
	public Class<Greeting> addMember(@RequestBody Greeting greeting) {
		return Greeting.class;
	}
}