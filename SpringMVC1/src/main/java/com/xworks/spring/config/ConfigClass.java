package com.xworks.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworks.spring")
public class ConfigClass {

//    public void springConfigClass()//we not able to create method in config
//    class because method is only for object creation in config class
//    {
//        System.out.println("object is cretaed for this project");
//    }


    public ConfigClass() {
        System.out.println("object is cretaed for this project");
    }
}
