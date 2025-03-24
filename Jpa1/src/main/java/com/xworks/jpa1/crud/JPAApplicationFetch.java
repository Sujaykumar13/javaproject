package com.xworks.jpa1.crud;

import dto.CountryDto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAApplicationFetch {

    public static void main(String[] args) {
        EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("java");
        EntityManager entityManger = entityMangerFactory.createEntityManager();

        CountryDto country = entityManger.find(CountryDto.class, 10);
        System.out.println(country.getCountryCode());
        System.out.println(country.getCountryName());
        System.out.println(country.getPopulation());
        System.out.println(country.getPresidentName());

        CountryDto country1 = entityManger.find(CountryDto.class, 16);
        System.out.println(country1.getCountryCode());
        System.out.println(country1.getCountryName());
        System.out.println(country1.getPopulation());
        System.out.println(country1.getPresidentName());

        CountryDto country2 = entityManger.find(CountryDto.class, 20);
        System.out.println(country2.getCountryCode());
        System.out.println(country2.getCountryName());
        System.out.println(country2.getPopulation());
        System.out.println(country2.getPresidentName());

        CountryDto country3 = entityManger.find(CountryDto.class, 1);
        System.out.println(country3.getCountryCode());
        System.out.println(country3.getCountryName());
        System.out.println(country3.getPopulation());
        System.out.println(country3.getPresidentName());

        CountryDto country4 = entityManger.find(CountryDto.class, 12);
        System.out.println(country4.getCountryCode());
        System.out.println(country4.getCountryName());
        System.out.println(country4.getPopulation());
        System.out.println(country4.getPresidentName());

        CountryDto country5 = entityManger.find(CountryDto.class, 15);
        System.out.println(country5.getCountryCode());
        System.out.println(country5.getCountryName());
        System.out.println(country5.getPopulation());
        System.out.println(country5.getPresidentName());

        CountryDto country6 = entityManger.find(CountryDto.class, 30);
        System.out.println(country6.getCountryCode());
        System.out.println(country6.getCountryName());
        System.out.println(country6.getPopulation());
        System.out.println(country6.getPresidentName());

        CountryDto country7 = entityManger.find(CountryDto.class, 18);
        System.out.println(country7.getCountryCode());
        System.out.println(country7.getCountryName());
        System.out.println(country7.getPopulation());
        System.out.println(country7.getPresidentName());

        CountryDto country8 = entityManger.find(CountryDto.class, 12);
        System.out.println(country8.getCountryCode());
        System.out.println(country8.getCountryName());
        System.out.println(country8.getPopulation());
        System.out.println(country8.getPresidentName());

        CountryDto country9 = entityManger.find(CountryDto.class, 8);
        System.out.println(country9.getCountryCode());
        System.out.println(country9.getCountryName());
        System.out.println(country9.getPopulation());
        System.out.println(country9.getPresidentName());

        CountryDto country10 = entityManger.find(CountryDto.class, 29);
        System.out.println(country10.getCountryCode());
        System.out.println(country10.getCountryName());
        System.out.println(country10.getPopulation());
        System.out.println(country10.getPresidentName());


        entityManger.close();

    }
}
