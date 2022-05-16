package com.greymatter.msscbrewery.services;

import com.greymatter.msscbrewery.web.model.BeerDto;
import com.greymatter.msscbrewery.web.model.Customer;

import java.util.UUID;

public interface CustomerService {
    Customer getCustomerById(UUID id);
}
