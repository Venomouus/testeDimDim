package br.com.dimdim.testedimdim.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dimdim.testedimdim.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    
}
