package com.crud.gestionprestamos.controllers;

import com.crud.gestionprestamos.controllers.dtos.ClienteDTO;
import com.crud.gestionprestamos.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    private ClienteRepository repositorio;

    @GetMapping("/clientes")
    public List<ClienteDTO> consultarClientes() {
        return repositorio.findAll().stream().map(ClienteDTO::new).collect(Collectors.toList());
    }


}
