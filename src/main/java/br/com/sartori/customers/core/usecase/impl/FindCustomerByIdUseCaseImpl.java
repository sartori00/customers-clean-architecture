package br.com.sartori.customers.core.usecase.impl;

import br.com.sartori.customers.core.dataprovider.FindCustomerById;
import br.com.sartori.customers.core.domain.Customer;
import br.com.sartori.customers.core.exceptions.EntityNotFoundException;
import br.com.sartori.customers.core.usecase.FindCustomerByIdUseCase;

public class FindCustomerByIdUseCaseImpl implements FindCustomerByIdUseCase {

    private final FindCustomerById findCustomerById;

    public FindCustomerByIdUseCaseImpl(FindCustomerById findCustomerById) {
        this.findCustomerById = findCustomerById;
    }

    @Override
    public Customer find(String id) {
        return findCustomerById.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Customer Not Found"));
    }
}
