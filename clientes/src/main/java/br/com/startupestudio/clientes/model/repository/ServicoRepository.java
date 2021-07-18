package br.com.startupestudio.clientes.model.repository;

import br.com.startupestudio.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
