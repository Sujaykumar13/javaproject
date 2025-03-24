package com.xworks.jpa1.crud;

import com.xworks.jpa1.runner.CountriesRunner;
import dto.CountryDto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Collection;

public class JPAApplicationInsert {

    public static void main(String[] args) {
        EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("java");
        EntityManager entityManger = entityMangerFactory.createEntityManager();

        EntityTransaction transaction = entityManger.getTransaction();
        transaction.begin();

        Collection<CountryDto> countryDtos = CountriesRunner.getCountry();
        for (CountryDto countryDto : countryDtos) {//to insert from collection

            entityManger.merge(countryDto);

        }
        transaction.commit();
        entityMangerFactory.close();
    }
}
