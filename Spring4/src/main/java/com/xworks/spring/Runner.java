package com.xworks.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ConfigClass.class);

        Continent continent = applicationContext.getBean(Continent.class);
        continent.continentName();

        Country country = applicationContext.getBean(Country.class);
        country.countryName();

    }
}
