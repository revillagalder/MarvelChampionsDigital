package com.mcd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mcd.model.Carta;
import com.mcd.service.CartaService;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@RestController
@OpenAPIDefinition(info = @Info(title = "Marvel Champions Digital", description = "Backend del proyecto Marvel Champions Digital para la consulta de cartas almacenadas en MySQL y alimentada por la API de marvelcdb", version = "v1", license = @License(name = "Apache 2.0", url = "https://www.apache.org/licenses/LICENSE-2.0")))
@RequestMapping("/cartas")
public class CartaController {

	@Autowired
	private CartaService cartaService;

	@GetMapping("/")
	public List<Carta> getAllCartas() {
		return cartaService.getAllCartas();
	}

	@GetMapping("/obtenerCartaPorCode/{code}")
	public List<Carta> getCartaByCode(@PathVariable String code) {
		return cartaService.getCartaByCode(code);
	}

	@GetMapping("/obtenerCartasPorPackCode/{pack_code}")
	public List<Carta> getCartasByPackCode(@PathVariable String pack_code) {
		return cartaService.getCartasByPackCode(pack_code);
	}

	@CrossOrigin(origins = "http://localhost:4200") // Permitir solicitudes desde http://localhost:4200
	@GetMapping("/obtenerCartasPorTypeCode/{type_code}")
	public List<Carta> getCartasByTypeCode(@PathVariable String type_code) {
		return cartaService.getCartasByTypeCode(type_code);
	}

	@GetMapping("/obtenerCartasPorFactionCode/{faction_code}")
	public List<Carta> getCartasByFactionCode(@PathVariable String faction_code) {
		return cartaService.getCartasByFactionCode(faction_code);
	}

	@CrossOrigin(origins = "http://localhost:4200") // Permitir solicitudes desde http://localhost:4200
	@GetMapping("/obtenerCartasPorCardSetCode/{card_set_code}")
	public List<Carta> getCartasByCardSetCode(@PathVariable String card_set_code) {
		return cartaService.getCartasByCardSetCode(card_set_code);
	}

	@CrossOrigin(origins = "http://localhost:4200") // Permitir solicitudes desde http://localhost:4200
	@GetMapping("/obtenerCartasPorCardSetTypeNameCode/{card_set_type_name_code}")
	public List<Carta> getCartasByCardSetTypeNameCode(@PathVariable String card_set_type_name_code) {
		return cartaService.getCartasByCardSetTypeNameCode(card_set_type_name_code);
	}

	@CrossOrigin(origins = "http://localhost:4200") // Permitir solicitudes desde http://localhost:4200
	@GetMapping("/obtenerCartasPorCardSetCodeYTypeCode/{card_set_code}/{type_code}")
	public List<Carta> getCartasByCardSetCodeAndTypeCode(@PathVariable String card_set_code,
			@PathVariable String type_code) {
		return cartaService.getCartasByCardSetCodeAndTypeCode(card_set_code, type_code);
	}
	
	@CrossOrigin(origins = "http://localhost:4200") // Permitir solicitudes desde http://localhost:4200
	@GetMapping("/obtenerCartasPorCardSetCodesYTypeCodes/{card_set_code}/{type_code}")
	public List<Carta> getCartasByCardSetCodesAndTypeCode(@PathVariable List<String> card_set_code,
	        @PathVariable List<String> type_code) {
	    return cartaService.getCartasByCardSetCodesAndTypeCode(card_set_code, type_code);
	}


}
