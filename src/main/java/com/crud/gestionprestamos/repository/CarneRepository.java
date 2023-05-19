package com.crud.gestionprestamos.repository;

import com.crud.gestionprestamos.models.Carne;
import com.crud.gestionprestamos.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarneRepository extends JpaRepository<Carne, Long> {
}
