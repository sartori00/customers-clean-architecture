package br.com.sartori.customers.core.usecase;

import br.com.sartori.customers.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer find(final String id);
}
