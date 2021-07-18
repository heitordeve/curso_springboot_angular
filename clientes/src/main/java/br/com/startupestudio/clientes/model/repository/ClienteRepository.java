package br.com.startupestudio.clientes.model.repository;

import br.com.startupestudio.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
