package com.crud.gestionprestamos.controllers.dtos;

import com.crud.gestionprestamos.models.Formato;
import com.crud.gestionprestamos.models.Libro;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class LibroDTO {

    public LibroDTO(Libro libro) {
        this.id = libro.getId();
        this.titulo = libro.getTitulo();
        this.autor = libro.getAutor();
        this.genero = libro.getGenero().getGenero();
        this.formatos = crearListaFormatos(libro.getFormatos());
    }

    private Long id;
    private String titulo;
    private String autor;
    private String genero;
    private List<String> formatos;

    private List<String> crearListaFormatos(List<Formato> formatos) {

        List<String> formatosDisp = new ArrayList<>();

        for (Formato f: formatos) {
            formatosDisp.add(f.getFormato());
        }

        return formatosDisp;
    }
}
