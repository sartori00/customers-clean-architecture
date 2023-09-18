package br.com.sartori.customers.config;

import br.com.sartori.customers.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import br.com.sartori.customers.dataprovider.impl.FindCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCaseImpl findCustomerByIdUseCase(FindCustomerByIdImpl findCustomerById) {
        return new FindCustomerByIdUseCaseImpl(findCustomerById);
    }
}
