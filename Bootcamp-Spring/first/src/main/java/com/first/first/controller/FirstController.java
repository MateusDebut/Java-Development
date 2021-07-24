package com.first.first.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class FirstController {

	@GetMapping
	public String first() {
		return"Utilizei a mentalidade de persistência e a habilidade de atenção aos detalhes";
	}
}
