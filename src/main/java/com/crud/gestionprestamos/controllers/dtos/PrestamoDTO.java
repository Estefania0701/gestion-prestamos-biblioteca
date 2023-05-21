package com.crud.gestionprestamos.controllers.dtos;

import com.crud.gestionprestamos.models.Cliente;
import com.crud.gestionprestamos.models.Libro;
import com.crud.gestionprestamos.models.Prestamo;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashMap;
import java.util.Map;

@Getter
@Setter
public class PrestamoDTO {

    public PrestamoDTO(Prestamo prestamo) {
        this.id = prestamo.getId();
        this.inicio = prestamo.getInicio();;
        this.fin = prestamo.getFin();
        this.cliente = crearClienteResumen(prestamo.getCliente());
        this.libro = crearLibroResumen(prestamo.getLibro());
    }

    private Long id;
    private String inicio;
    private String fin;
    private Map<String, String> cliente;
    private Map<String, String> libro;

    private Map<String, String> crearClienteResumen(Cliente cliente) {
        // Devuelve los datos resumidos del cliente

        Map<String, String> clienteDTO = new LinkedHashMap<>();

        clienteDTO.put("id", cliente.getId().toString());
        clienteDTO.put("nombre", cliente.getNombre());
        clienteDTO.put("apellido", cliente.getApellido());

        return clienteDTO;
    }

    private Map<String, String> crearLibroResumen(Libro libro) {
        // Devuelve los datos resumidos del libro

        Map<String, String> libroDTO = new LinkedHashMap<>();

        libroDTO.put("id", libro.getId().toString());
        libroDTO.put("titulo", libro.getTitulo());
        libroDTO.put("autor", libro.getAutor());

        return libroDTO;
    }
}
