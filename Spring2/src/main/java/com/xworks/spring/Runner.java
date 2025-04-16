package com.xworks.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ConfigcClass.class);
        Animal animal = applicationContext.getBean(Animal.class);
        animal.type();
        Lion lion = applicationContext.getBean(Lion.class);
        lion.sound();
        Tiger tiger = applicationContext.getBean(Tiger.class);
        tiger.noOfLegs();
    }
}
