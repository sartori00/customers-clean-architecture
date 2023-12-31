package br.com.sartori.customers.dataprovider.impl;

import br.com.sartori.customers.core.dataprovider.InsertCustomer;
import br.com.sartori.customers.core.domain.Customer;
import br.com.sartori.customers.dataprovider.mongodb.mapper.CustomerEntityMapper;
import br.com.sartori.customers.dataprovider.mongodb.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerImpl implements InsertCustomer {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void insert(Customer customer) {
        var customerEntity = CustomerEntityMapper.INSTANCE.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
