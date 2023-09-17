package br.com.sartori.customers.core.usecase;

import br.com.sartori.customers.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer findById(final String id);
}
