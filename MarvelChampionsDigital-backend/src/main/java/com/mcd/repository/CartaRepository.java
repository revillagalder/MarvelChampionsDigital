package com.mcd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mcd.model.Carta;

public interface CartaRepository extends JpaRepository<Carta, Long> {

	// Queries personalizadas
	
	List<Carta> findByCode(String code);

	List<Carta> findByPackCode(String pack_code);

	List<Carta> findByTypeCode(String type_code);

	List<Carta> findByFactionCode(String faction_code);

	List<Carta> findByCardSetTypeNameCode(String card_set_type_name_code);
}
