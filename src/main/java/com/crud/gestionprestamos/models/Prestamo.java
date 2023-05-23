package com.crud.gestionprestamos.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name = "prestamos")
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    @Column (name = "inicio", nullable = false)
    private String inicio;

    @Temporal(TemporalType.DATE)
    @Column (name = "fin", nullable = false)
    private String fin;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false, referencedColumnName = "id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "libro_id", referencedColumnName = "libro_id"),
            @JoinColumn(name = "formato_id", referencedColumnName = "formato_id")
    })
    private EjemplarLibro ejemplarLibro;

}
