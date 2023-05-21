package com.crud.gestionprestamos.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name = "libros")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "titulo", length = 100, nullable = false)
    private String titulo;

    @Column (name = "autor", length = 50, nullable = false)
    private String autor;

    @ManyToOne
    @JoinColumn(name = "genero_id", nullable = false, referencedColumnName = "id")
    private Genero genero;
}
