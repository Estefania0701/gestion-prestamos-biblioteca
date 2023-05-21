package com.crud.gestionprestamos.controllers;

import com.crud.gestionprestamos.controllers.dtos.CarneDTO;
import com.crud.gestionprestamos.repository.CarneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class CarneController {

    @Autowired
    CarneRepository repositorio;

    @GetMapping("/carnes")
    public List<CarneDTO> consultarCarnes() {
        return repositorio.findAll().stream().map(CarneDTO::new).collect(Collectors.toList());
    }
}
