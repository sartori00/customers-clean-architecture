package br.com.sartori.customers.entrypoint.consumer.mapper;

import br.com.sartori.customers.core.domain.Customer;
import br.com.sartori.customers.entrypoint.consumer.message.CustomerMessage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);


}
