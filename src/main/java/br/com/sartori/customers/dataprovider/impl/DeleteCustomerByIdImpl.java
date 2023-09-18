package br.com.sartori.customers.dataprovider.impl;

import br.com.sartori.customers.core.dataprovider.DeleteCustomerById;
import br.com.sartori.customers.dataprovider.mongodb.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdImpl implements DeleteCustomerById {

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}
