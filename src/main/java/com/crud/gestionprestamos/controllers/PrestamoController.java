package com.crud.gestionprestamos.controllers;

import com.crud.gestionprestamos.controllers.dtos.PrestamoDTO;
import com.crud.gestionprestamos.repository.PrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class PrestamoController {

    @Autowired
    private PrestamoRepository repositorio;

    @GetMapping("/prestamos")
    public List<PrestamoDTO> consultarPrestamos() {
        return repositorio.findAll().stream().map(PrestamoDTO::new).collect(Collectors.toList());
    }

}
