package com.crud.gestionprestamos.repository;

import com.crud.gestionprestamos.models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository <Libro, Long> {
}
