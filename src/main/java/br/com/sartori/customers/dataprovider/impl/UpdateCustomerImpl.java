package br.com.sartori.customers.dataprovider.impl;

import br.com.sartori.customers.core.dataprovider.UpdateCustomer;
import br.com.sartori.customers.core.domain.Customer;
import br.com.sartori.customers.dataprovider.mongodb.mapper.CustomerEntityMapper;
import br.com.sartori.customers.dataprovider.mongodb.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerImpl implements UpdateCustomer {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void update(Customer customer) {
        var customerEntity = CustomerEntityMapper.INSTANCE.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
