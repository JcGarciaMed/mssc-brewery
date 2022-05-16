package com.greymatter.msscbrewery.web.controller;

import com.greymatter.msscbrewery.services.BeerService;
import com.greymatter.msscbrewery.services.CustomerService;
import com.greymatter.msscbrewery.web.model.BeerDto;
import com.greymatter.msscbrewery.web.model.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<Customer> getBeer(@PathVariable("id") UUID id){
        return new ResponseEntity<>(customerService.getCustomerById(id), HttpStatus.OK);
    }

}
