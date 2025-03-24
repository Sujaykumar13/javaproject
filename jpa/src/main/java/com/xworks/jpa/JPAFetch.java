package com.xworks.jpa;

import com.xworks.dto.CricketTeamDto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAFetch {

    public static void main(String[] args) {
        EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("java");
        EntityManager entityManger = entityMangerFactory.createEntityManager();

        CricketTeamDto player = entityManger.find(CricketTeamDto.class, 1);
        System.out.println(player.getPlayer_name());
        System.out.println(player.getJerseyNum());
        System.out.println(player.getPlayer_type());
        System.out.println(player.getBirth_date());
        System.out.println(player.getBirth_place());
        System.out.println(player.getMatches());
        System.out.println(player.getTest_runs());

        entityManger.close();

    }
}
