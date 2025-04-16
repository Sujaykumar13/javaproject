package com.streams;

import com.xworks.dto.CountryDto;
import com.xworks.runner.CoutntryRunner;

import java.util.Collection;

public class Country {
    public static void main(String[] args) {
        Collection<CountryDto> countryDto = CoutntryRunner.getCountry();

    }
}
