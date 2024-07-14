package com.dsaa.helpdesk.repositories;

import com.dsaa.helpdesk.domains.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {


}
