package com.greymatter.msscbrewery.services;

import com.greymatter.msscbrewery.web.model.BeerDto;
import com.greymatter.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID id);
    CustomerDto saveNewCustomer(CustomerDto customerDto);
    void updateCustomer(UUID customerId,CustomerDto customerDto);
    void deleteById(UUID customerId);
}
