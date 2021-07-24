package org.vestibulandosdacidadania.Learn.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_materia")
public class Materia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 3, max = 255)
	private String nome;
	
	@NotNull
	@Size(min = 3, max = 255)
	private String eixo;
	
	@OneToMany(mappedBy = "materia",cascade =  CascadeType.ALL)
	@JsonIgnoreProperties("materia")
	private List<Aula> aula;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEixo() {
		return eixo;
	}

	public void setEixo(String eixo) {
		this.eixo = eixo;
	}

	public List<Aula> getAula() {
		return aula;
	}

	public void setAula(List<Aula> aula) {
		this.aula = aula;
	}	
	
}
