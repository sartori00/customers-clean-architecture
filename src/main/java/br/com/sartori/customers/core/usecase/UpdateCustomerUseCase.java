package br.com.sartori.customers.core.usecase;

import br.com.sartori.customers.core.domain.Customer;

public interface UpdateCustomerUseCase {

    void update(Customer customer, String zipCode);
}
