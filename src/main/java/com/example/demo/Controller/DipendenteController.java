package com.example.demo.Controller;


import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.Models.Dipendente;
import com.example.demo.Service.DipendenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dipendenti")
public class DipendenteController {

    @Autowired
    private DipendenteService dipendenteService;

    @GetMapping("/{id}")
    public Dipendente getDipendente(@PathVariable Long id){
        return dipendenteService.getDipendente(id);
    }

    @GetMapping("/")
    public List<Dipendente> getAllDipendenti(){
        return dipendenteService.getAllDipendenti();
    }

    @PostMapping("/")
    public Dipendente aggiungiDipendente(@RequestBody Dipendente dipendente){
        return dipendenteService.aggiungiDipendente(dipendente);
    }

    @PutMapping("/{id}")
    public Dipendente updateDipendente(@PathVariable Long id , @RequestBody Dipendente dipendente) {
       Dipendente dipendenteAggiornato =  dipendenteService.updateDipendente(id,dipendente);

       if (dipendenteAggiornato != null){
           return dipendenteAggiornato;
       }else {
           throw new ResourceNotFoundException("Dipendente con id " + id + " non trovato.");
       }
    }

    @DeleteMapping("/{id}")
    public void deleteDipendente(@PathVariable Long id){
        dipendenteService.deleteDipendente(id);
    }


}
