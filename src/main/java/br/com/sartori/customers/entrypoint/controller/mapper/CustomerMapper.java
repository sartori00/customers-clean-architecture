package br.com.sartori.customers.entrypoint.controller.mapper;

import br.com.sartori.customers.core.domain.Customer;
import br.com.sartori.customers.entrypoint.controller.dto.CustomerRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);
}
