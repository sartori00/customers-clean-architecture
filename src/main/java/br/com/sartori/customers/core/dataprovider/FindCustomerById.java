package br.com.sartori.customers.core.dataprovider;

import br.com.sartori.customers.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {

    Optional<Customer> findById(String id);
}
