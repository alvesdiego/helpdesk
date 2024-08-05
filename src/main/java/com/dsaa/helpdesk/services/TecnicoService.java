package com.dsaa.helpdesk.services;


import com.dsaa.helpdesk.domain.Tecnico;
import com.dsaa.helpdesk.domain.dtos.TecnicoDTO;
import com.dsaa.helpdesk.repositories.TecnicoRepository;
import com.dsaa.helpdesk.services.exceptions.ObjectnotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TecnicoService {

    @Autowired
    private TecnicoRepository repository;

    public Tecnico findById(Integer id){
        Optional<Tecnico> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não encontrado " + id));
    }

    public List<Tecnico> findAll() {
        return repository.findAll();
    }

    public Tecnico create(TecnicoDTO objDTO) {
        objDTO.setId(null);
        Tecnico newObj = new Tecnico(objDTO);
        return repository.save(newObj);
    }
}