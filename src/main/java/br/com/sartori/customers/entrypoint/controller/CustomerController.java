package br.com.sartori.customers.entrypoint.controller;

import br.com.sartori.customers.core.usecase.DeleteCustomerByIdUseCase;
import br.com.sartori.customers.core.usecase.FindCustomerByIdUseCase;
import br.com.sartori.customers.core.usecase.InsertCustomerUseCase;
import br.com.sartori.customers.core.usecase.UpdateCustomerUseCase;
import br.com.sartori.customers.entrypoint.controller.dto.CustomerRequest;
import br.com.sartori.customers.entrypoint.controller.dto.CustomerResponse;
import br.com.sartori.customers.entrypoint.controller.mapper.CustomerMapper;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerUseCase insertCustomerUseCase;

    @Autowired
    private FindCustomerByIdUseCase findCustomerByIdUseCase;

    @Autowired
    private UpdateCustomerUseCase updateCustomerUseCase;

    @Autowired
    private DeleteCustomerByIdUseCase deleteCustomerByIdUseCase;

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody @Valid CustomerRequest request){
        insertCustomerUseCase.insert(CustomerMapper.INSTANCE.toCustomer(request), request.zipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable("id") final String id){
        var customer = findCustomerByIdUseCase.findById(id);
        return ResponseEntity.ok().body(CustomerMapper.INSTANCE.toCustomerResponse(customer));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable("id") final String id,
                                       @RequestBody @Valid CustomerRequest request){
        var customer = CustomerMapper.INSTANCE.toCustomer(request);
        customer.setId(id);

        updateCustomerUseCase.update(customer, request.zipCode());

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable("id") final String id){
        deleteCustomerByIdUseCase.delete(id);
        return ResponseEntity.noContent().build();
    }

}
