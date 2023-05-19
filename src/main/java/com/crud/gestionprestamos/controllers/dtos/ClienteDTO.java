package com.crud.gestionprestamos.controllers.dtos;
import com.crud.gestionprestamos.models.Cliente;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteDTO {

    public ClienteDTO(Cliente cliente) {
        this.id = cliente.getId();
        this.nombre = cliente.getNombre();
        this.apellido = cliente.getApellido();
        this.identificacion = cliente.getIdentificacion();
        this.celular = cliente.getCelular();
        this.direccion = cliente.getDireccion();
        this.carne = cliente.getCarne().getNumero(); // solo obtener numero del carnet
    }

    private Long id;

    private String nombre;

    private String apellido;

    private Long identificacion;

    private Long celular;

    private String direccion;

    private Long carne;

}
