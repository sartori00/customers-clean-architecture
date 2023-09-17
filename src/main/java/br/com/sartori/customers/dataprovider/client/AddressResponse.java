package br.com.sartori.customers.dataprovider.client;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public record AddressResponse(String street, String city, String state) {
}
