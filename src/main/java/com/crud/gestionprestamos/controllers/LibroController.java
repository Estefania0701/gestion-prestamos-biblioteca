package com.crud.gestionprestamos.controllers;

import com.crud.gestionprestamos.controllers.dtos.LibroDTO;
import com.crud.gestionprestamos.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class LibroController {

    @Autowired
    private LibroRepository repositorio;

    @GetMapping("/libros")
    public List<LibroDTO> consultarPrestamos() {
        return repositorio.findAll().stream().map(LibroDTO::new).collect(Collectors.toList());
    }
}
