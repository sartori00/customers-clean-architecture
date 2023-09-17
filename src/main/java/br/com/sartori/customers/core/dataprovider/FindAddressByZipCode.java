package br.com.sartori.customers.core.dataprovider;

import br.com.sartori.customers.core.domain.Address;

public interface FindAddressByZipCode {

    Address find (final String zipCode);

}
