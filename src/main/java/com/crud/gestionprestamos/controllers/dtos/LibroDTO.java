package com.crud.gestionprestamos.controllers.dtos;

import com.crud.gestionprestamos.models.Libro;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LibroDTO {

    public LibroDTO(Libro libro) {
        this.id = libro.getId();
        this.titulo = libro.getTitulo();
        this.autor = libro.getAutor();
        this.genero = libro.getGenero().getGenero();
    }

    private Long id;
    private String titulo;
    private String autor;
    private String genero;
}
