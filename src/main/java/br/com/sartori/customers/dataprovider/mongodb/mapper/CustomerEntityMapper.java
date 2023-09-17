package br.com.sartori.customers.dataprovider.mongodb.mapper;

import br.com.sartori.customers.core.domain.Customer;
import br.com.sartori.customers.dataprovider.mongodb.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
