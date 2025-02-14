package com.example.demo.Service;


import com.example.demo.Models.Viaggio;
import com.example.demo.Repository.ViaggioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViaggioService {

    @Autowired
    public ViaggioRepository viaggioRepository;

    public Viaggio getViaggio(Long id){
        return viaggioRepository.findById(id).orElse(null);
    }

    public List<Viaggio> getAllViaggi(){
        return viaggioRepository.findAll();
    }

    public Viaggio addViaggio(Viaggio viaggio){
        return viaggioRepository.save(viaggio);
    }

    public Viaggio updateViaggio(Long id, Viaggio newViaggio){
        newViaggio.setId(id);
        Viaggio updatedViaggio = viaggioRepository.save(newViaggio);
        return updatedViaggio;
    }

    public void deleteViaggio(Long id){
        viaggioRepository.deleteById(id);
    }
}


