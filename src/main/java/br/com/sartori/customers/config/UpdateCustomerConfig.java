package br.com.sartori.customers.config;

import br.com.sartori.customers.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import br.com.sartori.customers.core.usecase.impl.UpdateCustomerUseCaseImpl;
import br.com.sartori.customers.dataprovider.impl.FindAddressByZipCodeImpl;
import br.com.sartori.customers.dataprovider.impl.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCaseImpl updateCustomerUseCase(
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
            FindAddressByZipCodeImpl findAddressByZipCode,
            UpdateCustomerImpl updateCustomer
    ) {
        return new UpdateCustomerUseCaseImpl(findCustomerByIdUseCase, findAddressByZipCode, updateCustomer);
    }
}
