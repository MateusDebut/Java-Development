package br.com.api.api.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HeroDTO {
	
	@JsonProperty("nome")
	private String nome;
	@JsonProperty("forca")
	private int forca;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}

}
