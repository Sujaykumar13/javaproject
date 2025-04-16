package com.xworks.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Animal {

    Lion lion;
    @Autowired
    public void setLion(Lion lion) {
        this.lion = lion;
    }

    Animal(Lion lion) {
        this.lion = lion;
    }

    public void type()
    {
        System.out.println("this is carnivorous animal class"+lion.animal);
    }
}
