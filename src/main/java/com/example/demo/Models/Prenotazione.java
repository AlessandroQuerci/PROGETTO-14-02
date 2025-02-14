package com.example.demo.Models;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "prenotazioni")
@Data
public class Prenotazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Viaggio viaggio;

    @Column(unique = true, nullable = false)
    private LocalDate dataDiRichiesta;

    private String preferenze;





}
