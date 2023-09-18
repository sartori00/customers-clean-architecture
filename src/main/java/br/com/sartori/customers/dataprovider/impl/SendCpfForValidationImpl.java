package br.com.sartori.customers.dataprovider.impl;

import br.com.sartori.customers.core.dataprovider.SendCpfForValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class SendCpfForValidationImpl implements SendCpfForValidation {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void send(String cpf) {
        kafkaTemplate.send("tp-cpf-validation", cpf);
    }
}
