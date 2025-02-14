package com.example.demo.Service;


import com.example.demo.Models.Dipendente;
import com.example.demo.Models.Prenotazione;
import com.example.demo.Repository.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrenotazioneService {

    @Autowired
    public PrenotazioneRepository prenotazioneRepository;

    public Prenotazione getPrenotazione(Long id){
        return prenotazioneRepository.findById(id).orElse(null);
    }

    public List<Prenotazione> getAllPrenotazioni(){
        return prenotazioneRepository.findAll();
    }

    public Prenotazione addPrenotazione(Prenotazione prenotazione){
        return prenotazioneRepository.save(prenotazione);
    }

    public Prenotazione updatePrenotazione(Long id, Prenotazione newPrenotazione){
        Prenotazione prenotazioneDatata = prenotazioneRepository.find

    }

    public void deletePrenotazione(Long id){
        prenotazioneRepository.deleteById(id);
    }
}


