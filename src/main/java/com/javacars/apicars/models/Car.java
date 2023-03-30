package com.javacars.apicars.models;

import com.javacars.apicars.dto.carDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Car {

    public Car(carDTO req) {
        this.modelo = req.modelo();
        this.fabricante = req.fabricante();
        this.data_fabricacao = req.data_fabricacao();
        this.valor = req.valor();
        this.ano_modelo = req.ano_modelo();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String modelo;

    @Column(nullable = false)
    private String fabricante;

    @Column(nullable = false)
    private String data_fabricacao;

    @Column(nullable = false)
    private double valor;

    @Column(nullable = false)
    private int ano_modelo;

}
