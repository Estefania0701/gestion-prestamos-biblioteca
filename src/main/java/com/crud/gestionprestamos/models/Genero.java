package com.crud.gestionprestamos.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table (name = "generos")
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "genero", length = 50, nullable = false)
    private String genero;

    @JsonIgnore
    @ManyToMany(mappedBy = "generos_favoritos")
    private List<Cliente> clientes;
}
