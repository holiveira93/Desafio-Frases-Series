package com.example.Desafio_Frases_Series.services;

import com.example.Desafio_Frases_Series.dto.FraseDTO;
import com.example.Desafio_Frases_Series.models.Frase;
import com.example.Desafio_Frases_Series.repositories.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    FraseRepository fraseRepository;

    public FraseDTO findRandomFrase(){
        Frase frase = fraseRepository.findRandomFrase();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
