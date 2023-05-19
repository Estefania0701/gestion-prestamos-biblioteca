package com.crud.gestionprestamos.repository;

import com.crud.gestionprestamos.models.Formato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormatoRepository extends JpaRepository<Formato, Long> {
}
