package br.com.sartori.customers.entrypoint.controller.mapper;

import br.com.sartori.customers.core.domain.Customer;
import br.com.sartori.customers.entrypoint.controller.dto.CustomerRequest;
import br.com.sartori.customers.entrypoint.controller.dto.CustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper( CustomerMapper.class );

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "validCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);
}
