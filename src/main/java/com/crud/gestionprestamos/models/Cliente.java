package com.crud.gestionprestamos.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table (name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column (name = "apellido", length = 50, nullable = false)
    private String apellido;

    @Column (name = "identificacion", length = 50, nullable = false)
    private Long identificacion;

    @Column (name = "celular", length = 50, nullable = false)
    private Long celular;

    @Column (name = "direccion", length = 255, nullable = false)
    private String direccion;

    // Carne del cliente
    @JsonIgnore // para
    @OneToOne(mappedBy = "cliente")
    @PrimaryKeyJoinColumn
    private Carne carne;
}
