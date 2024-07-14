package com.dsaa.helpdesk.repositories;

import com.dsaa.helpdesk.domains.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {


}
