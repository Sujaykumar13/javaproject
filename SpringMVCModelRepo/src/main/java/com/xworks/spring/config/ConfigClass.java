package com.xworks.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.xworks.spring")
public class ConfigClass {

        public ConfigClass() {
            System.out.println("object is cretaed for this project");
        }

    }

