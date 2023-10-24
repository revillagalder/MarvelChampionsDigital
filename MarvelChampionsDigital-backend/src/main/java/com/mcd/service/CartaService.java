package com.mcd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcd.model.Carta;
import com.mcd.repository.CartaRepository;

@Service
public class CartaService {

	@Autowired
	private CartaRepository cartaRepository;

	public List<Carta> getAllCartas() {
		return cartaRepository.findAll();
	}

	public List<Carta> getCartaByCode(String code) {
		return cartaRepository.findByCode(code);
	}

	public List<Carta> getCartasByPackCode(String pack_code) {
		return cartaRepository.findByPackCode(pack_code);
	}

	public List<Carta> getCartasByTypeCode(String type_code) {
		return cartaRepository.findByTypeCode(type_code);
	}

	public List<Carta> getCartasByFactionCode(String faction_code) {
		return cartaRepository.findByFactionCode(faction_code);
	}

	public List<Carta> getCartasByCardSetCode(String card_set_code) {
		return cartaRepository.findByCardSetCode(card_set_code);
	}

	public List<Carta> getCartasByCardSetTypeNameCode(String card_set_type_name_code) {
		return cartaRepository.findByCardSetTypeNameCode(card_set_type_name_code);
	}

	public List<Carta> getCartasByCardSetCodeAndTypeCode(String card_set_code, String type_code) {
		return cartaRepository.findByCardSetCodeAndTypeCode(card_set_code, type_code);
	}
	
	public List<Carta> getCartasByCardSetCodesAndTypeCode(List<String> card_set_code, List<String> type_code) {
	    return cartaRepository.findByCardSetCodeInAndTypeCodeIn(card_set_code, type_code);
	}


}
