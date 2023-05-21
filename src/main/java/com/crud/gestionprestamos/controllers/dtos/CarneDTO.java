package com.crud.gestionprestamos.controllers.dtos;

import com.crud.gestionprestamos.models.Carne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarneDTO {

    public CarneDTO(Carne carne) {
        this.id_cliente = carne.getCliente().getId();
        this.numero = carne.getNumero();
        this.nombre = carne.getCliente().getNombre();
        this.apellido = carne.getCliente().getApellido();
    }

    private Long id_cliente;
    private Long numero;
    private String nombre;
    private String apellido;
}
