package com.javacars.apicars.dto;

public record carDTO(
    String modelo,
    String fabricante,
    String data_fabricacao,
    double valor,
    int ano_modelo
) {
    
}
