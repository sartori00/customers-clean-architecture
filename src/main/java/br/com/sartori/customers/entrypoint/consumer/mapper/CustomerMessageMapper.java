package br.com.sartori.customers.entrypoint.consumer.mapper;

import br.com.sartori.customers.core.domain.Customer;
import br.com.sartori.customers.entrypoint.consumer.message.CustomerMessage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMessageMapper {

    CustomerMessageMapper INSTANCE = Mappers.getMapper( CustomerMessageMapper.class );

    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);


}
