package br.com.sartori.customers.core.usecase;

import br.com.sartori.customers.core.domain.Customer;

public interface InsertCustomerUseCase {

    void insert(Customer customer, String zipCode);
}
