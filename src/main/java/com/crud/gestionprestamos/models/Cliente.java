package com.crud.gestionprestamos.models;

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
    private Long id;

    @Column (name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column (name = "apellido", length = 50, nullable = false)
    private String apellido;

    @Column (name = "celular", length = 50, nullable = false)
    private Long celular;

    @Column (name = "direccion", length = 255, nullable = false)
    private String direccion;

    @OneToOne(mappedBy = "cliente")
    @PrimaryKeyJoinColumn
    private Carne carne;

    @ManyToMany
    @JoinTable (
            name = "generos_fav_clientes",
            joinColumns = @JoinColumn(name = "cliente_id", nullable = false, referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "genero_id", nullable = false, referencedColumnName = "id")
    )
    private List<Genero> generos_favoritos;
}
