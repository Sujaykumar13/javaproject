package com.xworks.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworks.spring",basePackageClasses = Lion.class)
public class ConfigcClass {
//    @Bean
//    public Animal animal()//we need to send parameter for this
//    {
//        return new Animal();
//    }

    @Bean
    public Lion lion()
    {
        return new Lion();
    }

    @Bean
    public Tiger tiger()
    {
        return new Tiger();
    }
}
