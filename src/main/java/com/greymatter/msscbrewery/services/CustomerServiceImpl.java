package com.greymatter.msscbrewery.services;

import com.greymatter.msscbrewery.web.model.BeerDto;
import com.greymatter.msscbrewery.web.model.Customer;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Override
    public Customer getCustomerById(UUID id) {
        return Customer.builder().id(UUID.randomUUID())
                .name("Jorge Carlos")
                .build();
    }
}
