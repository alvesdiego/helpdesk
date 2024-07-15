package com.dsaa.helpdesk.services;

import com.dsaa.helpdesk.domain.enums.Perfil;
import com.dsaa.helpdesk.domain.enums.Prioridade;
import com.dsaa.helpdesk.domain.enums.Status;
import com.dsaa.helpdesk.domains.Chamado;
import com.dsaa.helpdesk.domains.Cliente;
import com.dsaa.helpdesk.domains.Tecnico;
import com.dsaa.helpdesk.repositories.ChamadoRepository;
import com.dsaa.helpdesk.repositories.ClienteRepository;
import com.dsaa.helpdesk.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DBService {

    @Autowired
    private TecnicoRepository tecnicoRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ChamadoRepository chamadoRepository;

    public void instanciaDB(){

        Tecnico tec1 = new Tecnico(null, "Valdir Cesar" , "11122233344", "cesar@mail.com", "123");
        tec1.addPerfil(Perfil.ADMIN);

        Cliente cli1 = new Cliente(null, "Rafael Costa", "00151170256","rafael@mail.com", "123");

        Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1, cli1);

        tecnicoRepository.saveAll(List.of(tec1));
        clienteRepository.saveAll(List.of(cli1));
        chamadoRepository.saveAll(List.of(c1));
        System.out.println("### INSERT NO BANCO DE DADOS ###");

    }

}
