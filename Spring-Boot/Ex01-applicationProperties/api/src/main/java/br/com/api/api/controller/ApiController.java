package br.com.api.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.api.model.dto.HeroDTO;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	@GetMapping("/superman")
	public HeroDTO getSuperman() {
		HeroDTO hero = new HeroDTO();
		hero.setNome("Clark Kent");
		hero.setForca(100);
		return hero;
		
	}
	
	@GetMapping("/mulher_maravilha")
	public HeroDTO getMulherMaravilha() {
		HeroDTO hero = new HeroDTO();
		hero.setNome("Diana");
		hero.setForca(80);
		return hero;
	}
	
	@GetMapping("/batman")
	public HeroDTO getBatman() {
		HeroDTO hero = new HeroDTO();
		hero.setNome("Bruce Waine");
		hero.setForca(10);
		return hero;
	}

}
