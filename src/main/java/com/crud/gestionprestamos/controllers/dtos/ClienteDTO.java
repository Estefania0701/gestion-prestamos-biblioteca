package com.crud.gestionprestamos.controllers.dtos;

import com.crud.gestionprestamos.models.Cliente;
import com.crud.gestionprestamos.models.Genero;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClienteDTO {

    public ClienteDTO(Cliente cliente) {
        this.id = cliente.getId();
        this.nombre = cliente.getNombre();
        this.apellido = cliente.getApellido();
        this.celular = cliente.getCelular();
        this.direccion = cliente.getDireccion();
        this.carne = cliente.getCarne().getNumero(); // solo obtener numero del carnet
        this.generosFavoritos = crearListaGeneros(cliente.getGenerosFavoritos());
    }

    private Long id;
    private String nombre;
    private String apellido;
    private Long celular;
    private String direccion;
    private Long carne;
    private List<String> generosFavoritos;

    private List<String> crearListaGeneros (List<Genero> generos) {
        // Devuelve una lista con los géneros

        List<String> generosFav = new ArrayList<>();

        for (Genero g : generos) {
            generosFav.add(g.getGenero());
        }

        return generosFav;
    }
}
