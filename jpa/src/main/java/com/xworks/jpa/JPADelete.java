package com.xworks.jpa;

import com.xworks.dto.CricketTeamDto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPADelete {

    public static void main(String[] args) {
        EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("java");
        EntityManager entityManger = entityMangerFactory.createEntityManager();

        CricketTeamDto player = entityManger.find(CricketTeamDto.class, 7);
        EntityTransaction transaction = entityManger.getTransaction();
        transaction.begin();
        entityManger.remove(player);
        transaction.commit();

        entityManger.close();
    }
}
