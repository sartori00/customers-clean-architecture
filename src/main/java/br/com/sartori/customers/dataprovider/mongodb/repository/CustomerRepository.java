package br.com.sartori.customers.dataprovider.mongodb.repository;

import br.com.sartori.customers.dataprovider.mongodb.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
