package com.crud.gestionprestamos.controllers.dtos;

import com.crud.gestionprestamos.models.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PrestamoDTO {

    public PrestamoDTO(Prestamo prestamo) {
        this.id = prestamo.getId();
        this.inicio = prestamo.getInicio();;
        this.fin = prestamo.getFin();
        this.cliente = crearClienteResumen(prestamo.getCliente());
        this.libro = crearLibroResumen(prestamo.getEjemplarLibro());
    }

    private Long id;
    private String inicio;
    private String fin;
    private Cliente cliente;
    private EjemplarLibro libro;


    private Cliente crearClienteResumen(Cliente cliente) {
        // Devuelve los datos resumidos del cliente

        Cliente clienteResumen = new Cliente();

        clienteResumen.setId(cliente.getId());
        clienteResumen.setNombre(cliente.getNombre());
        clienteResumen.setApellido(cliente.getApellido());

        return clienteResumen;
    }

    private EjemplarLibro crearLibroResumen(EjemplarLibro libro) {
        // Devuelve los datos resumidos del libro

        EjemplarLibro libroResumen = new EjemplarLibro();

        // asignación del id
        libroResumen.setId(libro.getId()); // id (libro_id, formato_id)

        // asignación del libro
        Libro l = new Libro();
        libroResumen.setLibro(l);
        libroResumen.getLibro().setId(libro.getLibro().getId()); //id
        libroResumen.getLibro().setTitulo(libro.getLibro().getTitulo()); //titulo
        libroResumen.getLibro().setAutor(libro.getLibro().getAutor()); //autor

        // asignación del formato
        libroResumen.setFormato(libro.getFormato());

        return libroResumen;
    }
}
