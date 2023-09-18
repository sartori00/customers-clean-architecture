package br.com.sartori.customers.core.usecase.impl;

import br.com.sartori.customers.core.dataprovider.DeleteCustomerById;
import br.com.sartori.customers.core.usecase.DeleteCustomerByIdUseCase;
import br.com.sartori.customers.core.usecase.FindCustomerByIdUseCase;

public class DeleteCustomerByIdUseCaseImpl implements DeleteCustomerByIdUseCase {

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;

    private final DeleteCustomerById deleteCustomerById;

    public DeleteCustomerByIdUseCaseImpl(FindCustomerByIdUseCase findCustomerByIdUseCase,
                                         DeleteCustomerById deleteCustomerById) {
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.deleteCustomerById = deleteCustomerById;
    }

    @Override
    public void delete(String id) {
        findCustomerByIdUseCase.findById(id);
        deleteCustomerById.delete(id);
    }
}
