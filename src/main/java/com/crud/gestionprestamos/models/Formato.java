package com.crud.gestionprestamos.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table (name = "formatos")
public class Formato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "formato", length = 10, nullable = false)
    private String formato;

    // no necesario
    //@JsonIgnore
    @ManyToMany(mappedBy = "formatos")
    private List<Libro> libros;
}
