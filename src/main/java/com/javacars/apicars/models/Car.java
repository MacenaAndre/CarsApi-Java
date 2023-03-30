package com.javacars.apicars.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String modelo;

    private String fabricante;

    private String dataFabricacao;

    private double valor;

    private int anoModelo;
    
}
