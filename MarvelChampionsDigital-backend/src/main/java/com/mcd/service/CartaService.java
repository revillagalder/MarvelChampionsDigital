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
}
