package br.com.sartori.customers.entrypoint.controller.dto;

import jakarta.validation.constraints.NotBlank;

public record CustomerRequest(@NotBlank String name,
                              @NotBlank String cpf,
                              @NotBlank String zipCode) {
}
