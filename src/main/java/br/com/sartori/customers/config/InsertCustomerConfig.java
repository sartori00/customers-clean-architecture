package br.com.sartori.customers.config;

import br.com.sartori.customers.core.usecase.impl.InsertCustomerUseCaseImpl;
import br.com.sartori.customers.dataprovider.impl.FindAddressByZipCodeImpl;
import br.com.sartori.customers.dataprovider.impl.InsertCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(FindAddressByZipCodeImpl findAddressByZipCode,
                                                           InsertCustomerImpl insertCustomer) {

        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer);

    }
}
