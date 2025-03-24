package com.xworks.jpa;

import com.xworks.dto.CricketTeamDto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class JPAApplication3 {

        public static void main(String[] args) {
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("java");
            EntityManager entityManager = entityManagerFactory.createEntityManager();

            Query query1 = entityManager.createNamedQuery("query1");
            List<CricketTeamDto> result = query1.getResultList();

            for (CricketTeamDto cricketTeamDto : result) {
                System.out.println(cricketTeamDto.getPlayer_name());
                System.out.println(cricketTeamDto.getJerseyNum());
                System.out.println(cricketTeamDto.getPlayer_type());
                System.out.println(cricketTeamDto.getBirth_date());
                System.out.println(cricketTeamDto.getBirth_place());
                System.out.println(cricketTeamDto.getMatches());
                System.out.println(cricketTeamDto.getTest_runs());
                System.out.println("------------------------");
            }

            Query quer2 = entityManager.createNamedQuery("query2");
            List result1 = quer2.getResultList();
            System.out.println(result1.size());

            Query quer3 = entityManager.createNamedQuery("query3");
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

            Query quer4 = entityManager.createNamedQuery("query4");
            List result4 = quer4.getResultList();
            System.out.println(result4);

            Query quer5 = entityManager.createNamedQuery("query5");
            List result5 = quer5.getResultList();
            System.out.println(result5);

            Query quer6 = entityManager.createNamedQuery("query6");
            List result6 = quer6.getResultList();
            System.out.println(result6);

            Query quer7 = entityManager.createNamedQuery("query7");
            List result7 = quer7.getResultList();
            System.out.println(result7);

            Query quer8 = entityManager.createNamedQuery("query8");
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

            System.out.println("------------------------------------------------------------------");

            Query quer9= entityManager.createQuery("query9");
            quer9.setParameter("name", "viratkohli");
            List<CricketTeamDto> result9 = quer9.getResultList();


            for (CricketTeamDto cricketTeamDto9 : result9) {
                System.out.println(cricketTeamDto9.getPlayer_name());
                System.out.println(cricketTeamDto9.getJerseyNum());
                System.out.println(cricketTeamDto9.getPlayer_type());
                System.out.println(cricketTeamDto9.getBirth_date());
                System.out.println(cricketTeamDto9.getBirth_place());
                System.out.println(cricketTeamDto9.getMatches());
                System.out.println(cricketTeamDto9.getTest_runs());
            }

            Query quer10 = entityManager.createQuery("query10");
            List<CricketTeamDto> result10 = quer10.getResultList();

            for (CricketTeamDto cricketTeamDto10 : result10) {
                System.out.println(cricketTeamDto10.getPlayer_name());
                System.out.println(cricketTeamDto10.getJerseyNum());
                System.out.println(cricketTeamDto10.getPlayer_type());
                System.out.println(cricketTeamDto10.getBirth_date());
                System.out.println(cricketTeamDto10.getBirth_place());
                System.out.println(cricketTeamDto10.getMatches());
                System.out.println(cricketTeamDto10.getTest_runs());
            }


            entityManager.close();

        }

}
