package br.com.mateusRibeiro.minhaCarteira.repository;

import br.com.mateusRibeiro.minhaCarteira.model.Lancamentos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamentos, Long> {

}
