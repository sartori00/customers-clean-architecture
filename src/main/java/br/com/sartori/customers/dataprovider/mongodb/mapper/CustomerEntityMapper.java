package br.com.sartori.customers.dataprovider.mongodb.mapper;

import br.com.sartori.customers.core.domain.Customer;
import br.com.sartori.customers.dataprovider.mongodb.entity.CustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerEntityMapper {

    CustomerEntityMapper INSTANCE = Mappers.getMapper( CustomerEntityMapper.class );

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
