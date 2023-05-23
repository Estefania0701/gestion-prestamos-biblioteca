package com.crud.gestionprestamos.models;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class EjemplarLibroId implements Serializable {

    private Long libro_id;
    private Long formato_id;
}
