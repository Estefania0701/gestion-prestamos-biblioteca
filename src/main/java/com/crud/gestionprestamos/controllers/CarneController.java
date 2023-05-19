package com.crud.gestionprestamos.controllers;

import com.crud.gestionprestamos.models.Carne;
import com.crud.gestionprestamos.repository.CarneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CarneController {

    @Autowired
    CarneRepository repositorio;

    @GetMapping("/carnes")
    public List<Carne> consultarCarnes() {
        return repositorio.findAll();
    }
}
