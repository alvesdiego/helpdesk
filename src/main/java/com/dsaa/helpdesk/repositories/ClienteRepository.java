package com.dsaa.helpdesk.repositories;

import com.dsaa.helpdesk.domains.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    
}
