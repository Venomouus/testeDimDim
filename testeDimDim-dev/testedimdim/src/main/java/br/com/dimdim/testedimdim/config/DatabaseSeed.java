package br.com.dimdim.testedimdim.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.dimdim.testedimdim.model.Cliente;
import br.com.dimdim.testedimdim.repository.ClienteRepository;

@Configuration
@Profile("dev")
public class DatabaseSeed implements CommandLineRunner {

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public void run(String... args) throws Exception {


        clienteRepository.saveAll(List.of(
            new Cliente("Pedro", 19, "Rua Medeiros 200"),
            new Cliente("João", 23, "Rua Pedro 5022"),
            new Cliente("Nathan", 30, "Rua Augustinho 250"),
            new Cliente("Gabriel", 56, "Rua Moreira 45"),
            new Cliente("Gustavo", 20, "Rua Pedra 10")
        ));
    }
    
}
