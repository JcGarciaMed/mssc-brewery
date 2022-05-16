package com.greymatter.msscbrewery.services;

import com.greymatter.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
