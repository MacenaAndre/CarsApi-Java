package com.javacars.apicars.dto;

import java.util.Date;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

public record carDTO(
    @NotBlank String modelo,
    @NotBlank String fabricante,
    @Past @NotNull Date data_fabricacao,
    @DecimalMax("100000.0") @DecimalMin("0.0") @NotNull double valor,
    @NotNull int ano_modelo
) {
    
}
