package br.com.sartori.customers.core.usecase.impl;

import br.com.sartori.customers.core.dataprovider.FindAddressByZipCode;
import br.com.sartori.customers.core.dataprovider.InsertCustomer;
import br.com.sartori.customers.core.dataprovider.SendCpfForValidation;
import br.com.sartori.customers.core.domain.Customer;
import br.com.sartori.customers.core.usecase.InsertCustomerUseCase;

public class InsertCustomerUseCaseImpl implements InsertCustomerUseCase {

    private final FindAddressByZipCode findAddressByZipCode;

    private final InsertCustomer insertCustomer;

    private final SendCpfForValidation sendCpfForValidation;

    public InsertCustomerUseCaseImpl(FindAddressByZipCode findAddressByZipCod,
                                     InsertCustomer insertCustomer,
                                     SendCpfForValidation sendCpfForValidation) {

        this.findAddressByZipCode = findAddressByZipCod;
        this.insertCustomer = insertCustomer;
        this.sendCpfForValidation = sendCpfForValidation;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);

        insertCustomer.insert(customer);
        sendCpfForValidation.send(customer.getCpf());
    }
}
