package com.crud.gestionprestamos.controllers.dtos;

import com.crud.gestionprestamos.models.Cliente;
import com.crud.gestionprestamos.models.Libro;
import com.crud.gestionprestamos.models.Prestamo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PrestamoDTO {

    public PrestamoDTO(Prestamo prestamo) {
        this.id = prestamo.getId();
        this.inicio = prestamo.getInicio();;
        this.fin = prestamo.getFin();
        this.cliente = prestamo.getCliente();
        this.libro = prestamo.getLibro();
    }

    private Long id;

    private String inicio;

    private String fin;

    private Cliente cliente;

    private Libro libro;

}
