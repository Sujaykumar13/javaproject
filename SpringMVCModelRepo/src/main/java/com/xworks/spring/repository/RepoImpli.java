package com.xworks.spring.repository;

import com.xworks.spring.entity.StudentEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Repository//alias for component use in repo pacakge
public class RepoImpli implements RepoInterface {
    @Override
    public StudentEntity save(StudentEntity entity,String gender,String combination) {
        System.out.println("it is repositry class impliment");
        EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("java");
        EntityManager entityManger = entityMangerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManger.getTransaction();
            transaction.begin();
            entityManger.merge(entity);
            transaction.commit();
            entityMangerFactory.close();
        } catch (Exception e) {

            System.out.println("exception occur");
            return null;

        }
        return entity;
    }
}

