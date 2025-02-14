package com.example.demo.Service;


import com.example.demo.Models.Dipendente;
import com.example.demo.Repository.DipendenteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DipendenteService {

    @Autowired
    private DipendenteRepository dipendenteRepository;

    public Dipendente getDipendente(Long id){
        return dipendenteRepository.findById(id).orElse(null);
    }

    public List<Dipendente> getAllDipendenti(){
        return dipendenteRepository.findAll();

    }

    public Dipendente aggiungiDipendente(Dipendente dipendente){
        return dipendenteRepository.save(dipendente);
    }

    public Dipendente updateDipendente(Long id , Dipendente newDipendente) {

        public Optional<Dipendente> dipendenteOptional = dipendenteRepository.findById(id).orElse(null);



    }

    public void deleteDipendente(Long id){
        dipendenteRepository.deleteById(id);
    }
}
