package br.com.sartori.customers.core.domain;

public class Address {

    public Address(){}

    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    private String street;

    private String city;

    private String state;


}
