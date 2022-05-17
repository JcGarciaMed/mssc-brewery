package com.greymatter.msscbrewery.services;

import com.greymatter.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService{

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Cristal")
                .beerStyle("Para lavar los pies")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Cusqueña Baby")
                .beerStyle("Maso menos")
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //To be added
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a Beer.........");
    }

}
