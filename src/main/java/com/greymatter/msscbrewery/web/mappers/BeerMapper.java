package com.greymatter.msscbrewery.web.mappers;

import com.greymatter.msscbrewery.domain.Beer;
import com.greymatter.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerToBeerDto(BeerDto beerDto);
}
