package br.com.sartori.customers.dataprovider.impl;

import br.com.sartori.customers.core.dataprovider.FindCustomerById;
import br.com.sartori.customers.core.domain.Customer;
import br.com.sartori.customers.dataprovider.mongodb.mapper.CustomerEntityMapper;
import br.com.sartori.customers.dataprovider.mongodb.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdImpl implements FindCustomerById {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Optional<Customer> findById(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(CustomerEntityMapper.INSTANCE::toCustomer);
    }
}
