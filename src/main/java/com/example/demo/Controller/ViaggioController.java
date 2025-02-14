package com.example.demo.Controller;


import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.Models.Viaggio;
import com.example.demo.Service.ViaggioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/viaggi")
public class ViaggioController {

    @Autowired
    public ViaggioService viaggioService;

    @GetMapping("/{id}")
    public Viaggio getViaggio(@PathVariable Long id){
        return viaggioService.getViaggio(id);
    }

    @GetMapping("/")
    public List<Viaggio> getAllViaggi(){
        return viaggioService.getAllViaggi();
    }

    @PostMapping("/")
    public Viaggio aggiungiViaggio(@RequestBody Viaggio viaggio){
        return viaggioService.addViaggio(viaggio);
    }

    @PutMapping("/{id}")
    public Viaggio updateViaggio(@PathVariable Long id , @RequestBody Viaggio viaggio){
        Viaggio updatedViaggio = viaggioService.updateViaggio(id,viaggio);

        if (updatedViaggio != null){
            return updatedViaggio;
        }else {
            throw new ResourceNotFoundException("Viaggio con id " + id + " non trovato.");
        }
    }

    @DeleteMapping("/{id}")
    public void deleteViaggio(@PathVariable Long id){
        viaggioService.deleteViaggio(id);
    }



}
