package org.mateus.blogPessoal.repository;

import java.util.List;

import org.mateus.blogPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	
	public List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);
}
