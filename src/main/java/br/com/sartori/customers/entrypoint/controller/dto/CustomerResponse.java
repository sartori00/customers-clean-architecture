package br.com.sartori.customers.entrypoint.controller.dto;

public record CustomerResponse(String name, String cpf, Boolean isValidCpf, CustomerAddressResponse address) {
}
