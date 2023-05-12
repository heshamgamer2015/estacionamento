package br.com.uniamerica.estacinamento.repository;

import br.com.uniamerica.estacinamento.entity.Configuracao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfiguracaoRepository extends JpaRepository<Configuracao, Long> {
}