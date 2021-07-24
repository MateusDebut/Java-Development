package org.vestibulandosdacidadania.Learn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vestibulandosdacidadania.Learn.model.Materia;


public interface MateriaRepository extends JpaRepository<Materia, Long>{
	
	public List<Materia> findAllByNomeContainingIgnoreCase(String nome);
	
}
