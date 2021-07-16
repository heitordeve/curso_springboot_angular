package br.com.startupestudio.repository;

import br.com.startupestudio.model.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public class ClientesRepository {
    public void persistir(Cliente cliente) {
        //acessa o banco e salvo o cliente
    }
}
