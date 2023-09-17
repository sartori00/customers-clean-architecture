package br.com.sartori.customers.core.exceptions;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException (String message) {
        super(message);
    }
}
