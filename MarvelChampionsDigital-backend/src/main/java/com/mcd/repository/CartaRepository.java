package com.mcd.repository;

import com.mcd.model.Carta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartaRepository extends JpaRepository<Carta, Long> {
    // Puedes añadir consultas personalizadas aquí si es necesario
}

