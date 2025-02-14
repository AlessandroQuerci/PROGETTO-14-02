package com.example.demo.Models;


import com.example.demo.Enum.StatoViaggio;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "viaggi")
@Data
public class Viaggio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String destinazione;

    @Column(unique = true, nullable = false)
    private LocalDate dataViaggio;

    @Enumerated
    private StatoViaggio statoViaggio;

    @OneToOne
    @JoinColumn(name = "dipendente_id")
    private Dipendente dipendente;



}
