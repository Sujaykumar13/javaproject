package com.xworks.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworks.spring",basePackageClasses = Addidas.class)
public class ConfigClass {
   //@Bean
//    public Mall mall()//we need to send the parameter
//    {
//        return new Mall();
//    }

    @Bean
    public Addidas addidas()
    {
        return new Addidas();
    }

    @Bean
    public KFC kfc()
    {
        return new KFC();
    }


}
