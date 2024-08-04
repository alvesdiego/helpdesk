package com.dsaa.helpdesk.repositories;

import com.dsaa.helpdesk.domains.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {


}
