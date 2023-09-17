package br.com.sartori.customers.dataprovider;

import br.com.sartori.customers.core.dataprovider.FindAddressByZipCode;
import br.com.sartori.customers.core.domain.Address;
import br.com.sartori.customers.dataprovider.client.FindAddressByZipCodeClient;
import br.com.sartori.customers.dataprovider.client.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
