package com.xworks.jpa;

import com.xworks.dto.CricketTeamDto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class JavaApplication2 {
    public static void main(String[] args) {
       EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("java");
       EntityManager entityManager=entityManagerFactory.createEntityManager();

       String query="select c from CricketTeamDto c";
       Query query1=entityManager.createQuery(query);
        List<CricketTeamDto> result = query1.getResultList();

        for (CricketTeamDto cricketTeamDto : result) {
            System.out.println(cricketTeamDto.getPlayer_name());
            System.out.println(cricketTeamDto.getJerseyNum());
            System.out.println(cricketTeamDto.getPlayer_type());
            System.out.println(cricketTeamDto.getBirth_date());
            System.out.println(cricketTeamDto.getBirth_place());
            System.out.println(cricketTeamDto.getMatches());
            System.out.println(cricketTeamDto.getTest_runs());
        }

        System.out.println("-----------------------------------------------------------------------------");

        String query2="select count(*) from CricketTeamDto c";
        Query quer = entityManager.createQuery(query2);
        Object result1 = quer.getSingleResult();
        System.out.println(result1);

        String query3 = "select c from CricketTeamDto c where player_name like '__r%'";
        Query quer3=entityManager.createQuery(query3);
        List<CricketTeamDto> result2 = quer3.getResultList();

        for (CricketTeamDto cricketTeamDto1 : result2) {
            System.out.println(cricketTeamDto1.getPlayer_name());
            System.out.println(cricketTeamDto1.getJerseyNum());
            System.out.println(cricketTeamDto1.getPlayer_type());
            System.out.println(cricketTeamDto1.getBirth_date());
            System.out.println(cricketTeamDto1.getBirth_place());
            System.out.println(cricketTeamDto1.getMatches());
            System.out.println(cricketTeamDto1.getTest_runs());
        }

        String query4 = "select avg(test_runs) from CricketTeamDto";
        Query quer4 = entityManager.createQuery(query4);
        List result4 = quer4.getResultList();
        System.out.println(result4);

        String query5 = "select sum(test_runs) from CricketTeamDto";
        Query quer5 = entityManager.createQuery(query5);
        Object result5 = quer5.getSingleResult();
        System.out.println(result5);

        System.out.println("---------------------------------------------------------------------");

        String query6 = "select min(test_runs) from CricketTeamDto";
        Query quer6 = entityManager.createQuery(query6);
        List result6 = quer6.getResultList();
        System.out.println(result6);

        String query7 = "select max(test_runs) from CricketTeamDto";
        Query quer7 = entityManager.createQuery(query7);
        List result7 = quer7.getResultList();
        System.out.println(result7);

        String query8="select c from CricketTeamDto c where test_runs between 3000 and 9000";
        Query quer8=entityManager.createQuery(query8);
        List<CricketTeamDto> result8 = quer8.getResultList();

        for (CricketTeamDto cricketTeamDto8 : result8) {
            System.out.println(cricketTeamDto8.getPlayer_name());
            System.out.println(cricketTeamDto8.getJerseyNum());
            System.out.println(cricketTeamDto8.getPlayer_type());
            System.out.println(cricketTeamDto8.getBirth_date());
            System.out.println(cricketTeamDto8.getBirth_place());
            System.out.println(cricketTeamDto8.getMatches());
            System.out.println(cricketTeamDto8.getTest_runs());
        }

        String query10="select c from CricketTeamDto c where player_name=:name";
        Query query11=entityManager.createQuery(query10);
        query11.setParameter("name","viratkohli");
        List<CricketTeamDto> result11 = query11.getResultList();

        for (CricketTeamDto cricketTeamDto11 : result11) {
            System.out.println(cricketTeamDto11.getPlayer_name());
            System.out.println(cricketTeamDto11.getJerseyNum());
            System.out.println(cricketTeamDto11.getPlayer_type());
            System.out.println(cricketTeamDto11.getBirth_date());
            System.out.println(cricketTeamDto11.getBirth_place());
            System.out.println(cricketTeamDto11.getMatches());
            System.out.println(cricketTeamDto11.getTest_runs());
        }

        String query9 = "select player_type from CricketTeamDto group by player_type";
        Query quer9=entityManager.createQuery(query9);
        List<String> result9 = quer9.getResultList();

        for (String cricketTeamDto9 : result9) {
            System.out.println(cricketTeamDto9);

        }



        entityManager.close();

    }
}
