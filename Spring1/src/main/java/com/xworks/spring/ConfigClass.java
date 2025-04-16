package com.xworks.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworks.spring",basePackageClasses = College.class)
public class ConfigClass {
    @Bean
    public College college()
    {
        return new College();
    }

    @Bean
    public Teachers teachers()
    {
        return new Teachers();
    }

    @Bean
    public Student student()
    {
        return new Student();
    }

}
