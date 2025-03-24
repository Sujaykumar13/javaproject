package com.xworks.jpa;

import com.xworks.dto.CricketTeamDto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPAApplication {

    public static void main(String[] args) {
        EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("java");
        EntityManager entityManger = entityMangerFactory.createEntityManager();

        EntityTransaction transaction = entityManger.getTransaction();
        transaction.begin();
        CricketTeamDto player=new CricketTeamDto(140,"sujay","all-rounder","mysore","1997/02/13",150,8456);
        entityManger.merge(player);
        transaction.commit();
        entityMangerFactory.close();


    }
}
