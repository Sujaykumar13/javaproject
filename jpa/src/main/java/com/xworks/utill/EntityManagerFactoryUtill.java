package com.xworks.utill;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryUtill {

    private static EntityManagerFactory entityManagerFactory;

    public static EntityManagerFactory getEntityManagerFactory()
    {
        if(entityManagerFactory==null) {
            entityManagerFactory = Persistence.createEntityManagerFactory("java");
        }
        return entityManagerFactory;
    }
}
