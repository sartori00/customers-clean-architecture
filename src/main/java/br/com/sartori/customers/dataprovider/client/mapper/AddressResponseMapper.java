package br.com.sartori.customers.dataprovider.client.mapper;

import br.com.sartori.customers.core.domain.Address;
import br.com.sartori.customers.dataprovider.client.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
