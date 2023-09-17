package br.com.sartori.customers.entrypoint.controller;

import br.com.sartori.customers.core.usecase.InsertCustomerUseCase;
import br.com.sartori.customers.entrypoint.controller.dto.CustomerRequest;
import br.com.sartori.customers.entrypoint.controller.mapper.CustomerMapper;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerUseCase insertCustomerUseCase;

    @Autowired
    private CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody @Valid CustomerRequest request){
        insertCustomerUseCase.insert(customerMapper.toCustomer(request), request.zipCode());
        return ResponseEntity.ok().build();
    }

}
