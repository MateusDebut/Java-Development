package br.com.bff.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.bff.model.dto.HeroDTO;

@Service
public class HeroService {
	
	public HeroDTO chamaApiHero(String nomeHeroi) {
		RestTemplate restTemplate = new RestTemplate();
		HeroDTO heroi = restTemplate.getForObject("http://localhost:8081/api/"+nomeHeroi, HeroDTO.class);
		return heroi;
	}

}
