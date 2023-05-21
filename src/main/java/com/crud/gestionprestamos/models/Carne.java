package com.crud.gestionprestamos.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name = "carnes")
public class Carne {

    @Id
    @Column (name = "cliente_id", nullable = false)
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    private Cliente cliente;

    @Column (name = "numero", length = 8, nullable = false, unique = true)
    private Long numero;
}
