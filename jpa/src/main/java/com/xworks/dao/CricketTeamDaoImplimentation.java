package com.xworks.dao;

import com.xworks.dto.CricketTeamDto;
import com.xworks.utill.EntityManagerFactoryUtill;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

public class CricketTeamDaoImplimentation implements CricketTeamDao {
    @Override
    public CricketTeamDto savePlayer(CricketTeamDto cricketTeamDto) {

        EntityManagerFactory entityMangerFactory = EntityManagerFactoryUtill.getEntityManagerFactory();
        EntityManager entityManger = entityMangerFactory.createEntityManager();
        try{EntityTransaction transaction = entityManger.getTransaction();
        transaction.begin();
        entityManger.merge(cricketTeamDto);
        transaction.commit();
        entityMangerFactory.close();}
        catch (Exception e){

            System.out.println("exception occur");
             return null;

        }
        return cricketTeamDto;
    }

    @Override
    public int getPlayerByJerseyNum(int jerseyNum) {
        EntityManagerFactory entityMangerFactory = EntityManagerFactoryUtill.getEntityManagerFactory();
        EntityManager entityManger = entityMangerFactory.createEntityManager();

        CricketTeamDto player = entityManger.find(CricketTeamDto.class, jerseyNum);
        System.out.println(player.getPlayer_name());

        entityManger.close();
        return jerseyNum;
    }

    @Override
    public int getPlayerTypeByJerseyNum(int jerseyNum) {

        EntityManagerFactory entityMangerFactory = EntityManagerFactoryUtill.getEntityManagerFactory();
        EntityManager entityManger = entityMangerFactory.createEntityManager();

        CricketTeamDto player = entityManger.find(CricketTeamDto.class, jerseyNum);
        System.out.println(player.getPlayer_type());

        entityManger.close();
        return jerseyNum;
    }

    @Override
    public void updatePlayer(CricketTeamDto cricketTeamDto,int jerseyNum) {
        EntityManagerFactory entityMangerFactory = EntityManagerFactoryUtill.getEntityManagerFactory();
        EntityManager entityManger = entityMangerFactory.createEntityManager();

        CricketTeamDto player = entityManger.find(CricketTeamDto.class, jerseyNum);
        EntityTransaction transaction = entityManger.getTransaction();
        transaction.begin();
        player.setBirth_place("mysore");
        transaction.commit();

        entityManger.close();
    }

    @Override
    public void deletePlayer(int jerseyNum) {
        EntityManagerFactory entityMangerFactory = EntityManagerFactoryUtill.getEntityManagerFactory();
        EntityManager entityManger = entityMangerFactory.createEntityManager();

        CricketTeamDto player = entityManger.find(CricketTeamDto.class, jerseyNum);
        EntityTransaction transaction = entityManger.getTransaction();
        transaction.begin();
        entityManger.remove(player);//return type of remove method is void
        transaction.commit();

        entityManger.close();

    }

    @Override
    public void getPlayerNames() {

        EntityManagerFactory entityManagerFactory = EntityManagerFactoryUtill.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        String query="select c.player_name from CricketTeamDto c ";

        Query query1 = entityManager.createQuery(query);
        List<String> result = query1.getResultList();

        for (String cricketTeamDto : result) {
            System.out.println(cricketTeamDto);

        }
    }

    @Override
    public List<Object> getAllPlayerNameAndPlayerType() {

        EntityManagerFactory entityManagerFactory = EntityManagerFactoryUtill.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        String query="select c.player_name,c.player_type from CricketTeamDto c ";

        Query query1 = entityManager.createQuery(query);
        List<Object[]> result = query1.getResultList();

        for (Object[] cricketTeamDtos : result) {
            System.out.println(cricketTeamDtos[0]);
            System.out.println(cricketTeamDtos[1]);

        }
        return Collections.emptyList();
    }

    @Override
    public void getAllPlayerNameAndPlayerTypeByJerseyNum(int jerseyNum) {
        EntityManagerFactory entityMangerFactory = EntityManagerFactoryUtill.getEntityManagerFactory();
        EntityManager entityManger = entityMangerFactory.createEntityManager();

        CricketTeamDto player = entityManger.find(CricketTeamDto.class, jerseyNum);
        System.out.println(player.getPlayer_name());
        System.out.println(player.getPlayer_type());

        entityManger.close();

    }
}
