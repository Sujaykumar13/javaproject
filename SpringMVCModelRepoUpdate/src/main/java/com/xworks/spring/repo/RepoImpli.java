package com.xworks.spring.repo;

import com.xworks.spring.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Repository
public class RepoImpli implements RepoInterface{
//    @Autowired
//    EntityManagerFactory entityManagerFactory;
    @Override
    public StudentEntity save(StudentEntity entity,String gender,String combination) {
        System.out.println("it is repositry class impliment");
        System.out.println(entity);
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("java");
        EntityManager entityManger = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManger.getTransaction();
            transaction.begin();
            entityManger.merge(entity);
            transaction.commit();
        } catch (Exception e) {

            System.out.println("exception occur");
            return null;

        }finally {
            entityManger.close();
        }
        return entity;
    }
}
