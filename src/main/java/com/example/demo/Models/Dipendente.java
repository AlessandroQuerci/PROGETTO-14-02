package com.example.demo.Models;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "dipendenti")
@Data
public class Dipendente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(unique = true, nullable = false)
    private String nome;

    @Column(unique = true, nullable = false)
    private String cognome;

    @Column(unique = true, nullable = false)
    private String email;

    @OneToOne
    private Viaggio viaggio;


}
