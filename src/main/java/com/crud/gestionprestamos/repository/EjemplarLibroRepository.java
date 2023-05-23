package com.crud.gestionprestamos.repository;

import com.crud.gestionprestamos.models.EjemplarLibro;
import com.crud.gestionprestamos.models.EjemplarLibroId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EjemplarLibroRepository extends JpaRepository <EjemplarLibro, EjemplarLibroId>{
}
