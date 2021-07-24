package br.com.mateusRibeiro.minhaCarteira.repository;

import br.com.mateusRibeiro.minhaCarteira.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
