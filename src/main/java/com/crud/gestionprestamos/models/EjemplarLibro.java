package com.crud.gestionprestamos.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name = "ejemplares_libros")
public class EjemplarLibro {

    @EmbeddedId
    private EjemplarLibroId id;

    @ManyToOne
    @MapsId("libro_id")
    private Libro libro;

    @ManyToOne
    @MapsId("formato_id")
    private Formato formato;

    @Column (name="fecha")
    private String fecha;
}
