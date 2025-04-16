package com.xworks.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigClass.class);

        Mall mall = applicationContext.getBean(Mall.class);
        mall.location();

        Addidas addidas = applicationContext.getBean(Addidas.class);
        addidas.clothes();

        KFC kfc = applicationContext.getBean(KFC.class);
        kfc.type();
    }
}
