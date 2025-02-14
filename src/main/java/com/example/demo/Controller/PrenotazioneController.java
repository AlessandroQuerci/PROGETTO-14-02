package com.example.demo.Controller;


import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.Models.Prenotazione;
import com.example.demo.Service.PrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prenotazioni")
public class PrenotazioneController {

    @Autowired
    public PrenotazioneService prenotazioneService;

    @GetMapping("/{id}")
    public Prenotazione getPrenotazione(@PathVariable Long id){
        return prenotazioneService.getPrenotazione(id);
    }

    @GetMapping("/")
    public List<Prenotazione> getAllPrenotazioni(){
        return prenotazioneService.getAllPrenotazioni();
    }

    @PostMapping("/")
    public Prenotazione aggiungiPrenotazione(@RequestBody Prenotazione prenotazione){
        return prenotazioneService.addPrenotazione(prenotazione);
    }

    @PutMapping("/{id}")
    public Prenotazione updatePrenotazione(@PathVariable Long id , @RequestBody Prenotazione prenotazione){
        Prenotazione updatedPrenotazione = prenotazioneService.updatePrenotazione(id,prenotazione);

        if (updatedPrenotazione != null){
            return updatedPrenotazione;
        }else {
            throw new ResourceNotFoundException("Prenotazione con id " + id + " non trovato.");
        }
    }

    @DeleteMapping("/{id}")
    public void deletePrenotazione(@PathVariable Long id){
        prenotazioneService.deletePrenotazione(id);
    }



}

