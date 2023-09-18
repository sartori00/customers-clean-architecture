package br.com.sartori.customers.config;

import br.com.sartori.customers.core.usecase.impl.DeleteCustomerByIdUseCaseImpl;
import br.com.sartori.customers.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import br.com.sartori.customers.dataprovider.impl.DeleteCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerConfig {

    @Bean
    public DeleteCustomerByIdUseCaseImpl deleteCustomerByIdUseCase(
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
            DeleteCustomerByIdImpl deleteCustomerById
    ) {
        return new DeleteCustomerByIdUseCaseImpl(findCustomerByIdUseCase, deleteCustomerById);
    }
}
