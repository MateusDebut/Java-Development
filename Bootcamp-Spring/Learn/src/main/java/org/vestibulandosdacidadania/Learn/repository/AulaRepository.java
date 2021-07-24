package org.vestibulandosdacidadania.Learn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vestibulandosdacidadania.Learn.model.Aula;

@Repository
public interface AulaRepository extends JpaRepository<Aula, Long>{
	
	public List<Aula> findAllByTituloContainingIgnoreCase(String titulo);
	
}
