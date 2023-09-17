package br.com.sartori.customers.entrypoint.controller.dto;

public record CustomerResponse(String nome, String cpf, String isValidCpf, CustomerAddressResponse address) {
}
