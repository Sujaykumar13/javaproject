package com.xworks.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworks",basePackageClasses = Country.class)
public class ConfigClass {
    @Bean
    public Continent continent()
    {
        return new Continent();
    }

    @Bean
    public Country country()
    {
        return new Country();
    }


}
 