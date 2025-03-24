package com.xworks.jpa;

import com.xworks.dto.CricketTeamDto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPAUpdate {

    public static void main(String[] args) {
        EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("java");
        EntityManager entityManger = entityMangerFactory.createEntityManager();

        CricketTeamDto player = entityManger.find(CricketTeamDto.class, 18);
        EntityTransaction transaction = entityManger.getTransaction();
        transaction.begin();
        player.setBirth_place("bangalore");
        transaction.commit();

        entityManger.close();
    }
}
