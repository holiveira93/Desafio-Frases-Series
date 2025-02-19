package com.example.Desafio_Frases_Series.controllers;

import com.example.Desafio_Frases_Series.dto.FraseDTO;
import com.example.Desafio_Frases_Series.services.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {
    @Autowired
    FraseService fraseService;

    @GetMapping("/series/frases")
    public FraseDTO findRandomFrase (){
        return fraseService.findRandomFrase();
    }
}
