package br.com.bff.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bff.model.dto.HeroDTO;
import br.com.bff.service.HeroService;

@RestController
@RequestMapping("/bff")
public class BffController {
	
	@Autowired
	private HeroService heroSerice;
	
	@PostMapping("/hero/{nomeHeroi}")
	public HeroDTO getHero (@PathVariable String nomeHeroi) {
		return heroSerice.chamaApiHero(nomeHeroi);
	}

}
