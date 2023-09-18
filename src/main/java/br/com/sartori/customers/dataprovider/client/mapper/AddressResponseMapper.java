package br.com.sartori.customers.dataprovider.client.mapper;

import br.com.sartori.customers.core.domain.Address;
import br.com.sartori.customers.dataprovider.client.AddressResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AddressResponseMapper {

    AddressResponseMapper INSTANCE = Mappers.getMapper( AddressResponseMapper.class );

    Address toAddress(AddressResponse addressResponse);

}
