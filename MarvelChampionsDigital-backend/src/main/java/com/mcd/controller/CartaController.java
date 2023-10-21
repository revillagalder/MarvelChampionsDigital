package com.mcd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mcd.model.Carta;
import com.mcd.service.CartaService;

@RestController
@RequestMapping("/cartas")
public class CartaController {

    @Autowired
    private CartaService cartaService;
    
    @GetMapping("/")
    public List<Carta> getAllCartas() {
        return cartaService.getAllCartas();
    }
}
