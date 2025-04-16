package com.xworks.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@EnableWebMvc
@Configuration
@ComponentScan("com.xworks.spring")

public class ConfigClass {

    public ConfigClass() {
        System.out.println("object is cretaed for this project");
    }

    @Bean
public ViewResolver resolver()//when we add this we can return jsp page without mentioning .jsp
{
    InternalResourceViewResolver internalResourceViewResolver=new InternalResourceViewResolver();
    internalResourceViewResolver.setPrefix("/");
    internalResourceViewResolver.setSuffix(".jsp");
    return  internalResourceViewResolver;
}
//
//@Bean
//public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean()//add persistece provider
//{
//    LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean=new LocalContainerEntityManagerFactoryBean();
//    return localContainerEntityManagerFactoryBean;
//}
}
