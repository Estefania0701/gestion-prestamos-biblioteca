package com.crud.gestionprestamos.repository;

import com.crud.gestionprestamos.models.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {

}
