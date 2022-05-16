package com.greymatter.msscbrewery.services;

import com.greymatter.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService{

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Cristal")
                .beerStyle("Para lavar los pies")
                .build();
    }
}
