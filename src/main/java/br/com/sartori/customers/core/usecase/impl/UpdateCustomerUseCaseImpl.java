package br.com.sartori.customers.core.usecase.impl;

import br.com.sartori.customers.core.dataprovider.FindAddressByZipCode;
import br.com.sartori.customers.core.dataprovider.UpdateCustomer;
import br.com.sartori.customers.core.domain.Customer;
import br.com.sartori.customers.core.usecase.FindCustomerByIdUseCase;
import br.com.sartori.customers.core.usecase.UpdateCustomerUseCase;

public class UpdateCustomerUseCaseImpl implements UpdateCustomerUseCase {

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;

    private final FindAddressByZipCode findAddressByZipCode;

    private final UpdateCustomer updateCustomer;

    public UpdateCustomerUseCaseImpl(FindCustomerByIdUseCase findCustomerByIdUseCase,
                                     FindAddressByZipCode findAddressByZipCode,
                                     UpdateCustomer updateCustomer) {
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.findAddressByZipCode = findAddressByZipCode;
        this.updateCustomer = updateCustomer;
    }

    @Override
    public void update(Customer customer, String zipCode) {
        findCustomerByIdUseCase.findById(customer.getId());
        var address = findAddressByZipCode.find(zipCode);

        customer.setAddress(address);
        updateCustomer.update(customer);
    }
}
