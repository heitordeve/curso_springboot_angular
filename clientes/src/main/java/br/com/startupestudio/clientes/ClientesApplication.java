package br.com.startupestudio.clientes;

import br.com.startupestudio.clientes.model.entity.Cliente;
import br.com.startupestudio.clientes.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientesApplication {

   public static void main(String[] args) {
        SpringApplication.run(ClientesApplication.class, args);
    }
}
