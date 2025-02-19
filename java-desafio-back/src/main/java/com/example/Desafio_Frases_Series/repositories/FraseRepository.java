package com.example.Desafio_Frases_Series.repositories;


import com.example.Desafio_Frases_Series.models.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frase, Long> {

    @Query("select f from Frase f order by function('RANDOM') limit 1")
    Frase findRandomFrase();

}
