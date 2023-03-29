package com.javacars.apicars.dto;

public record carDTO(
    String modelo,
    String fabricante,
    String dataFabricacao,
    double valor,
    int anoModelo
) {
    
}
