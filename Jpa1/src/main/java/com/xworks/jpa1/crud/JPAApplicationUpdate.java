package com.xworks.jpa1.crud;

import dto.CountryDto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPAApplicationUpdate {

    public static void main(String[] args) {
        EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("java");
        EntityManager entityManger = entityMangerFactory.createEntityManager();

        CountryDto country = entityManger.find(CountryDto.class, 1);
        EntityTransaction transaction = entityManger.getTransaction();
        transaction.begin();
        country.setCountryName("India");
        country.setPopulation(1445677654);
       // country.setCountryCode(45);we not able to update primary key/identifier
        country.setPresidentName("murmo");
        transaction.commit(); 

        entityManger.close();
    }
}
