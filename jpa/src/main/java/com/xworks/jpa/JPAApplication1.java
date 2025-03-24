package com.xworks.jpa;

import com.xworks.CricketTeamRunner;
import com.xworks.dto.CricketTeamDto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Collection;

public class JPAApplication1 {

    public static void main(String[] args) {
        EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("java");
        EntityManager entityManger = entityMangerFactory.createEntityManager();

        EntityTransaction transaction = entityManger.getTransaction();
        transaction.begin();
        CricketTeamDto player = new CricketTeamDto(140, "sujay", "all-rounder", "mysore", "1997/02/13", 150, 8456);
        //to insert through constructor
        entityManger.merge(player);
        Collection<CricketTeamDto> teamDtos = CricketTeamRunner.getPlayers();
        for (CricketTeamDto teamDto : teamDtos) {//to insert from collection

            entityManger.merge(teamDto);
            //transaction.commit();//it will commit only one value
        }
        transaction.commit();
        entityMangerFactory.close();
    }
}
