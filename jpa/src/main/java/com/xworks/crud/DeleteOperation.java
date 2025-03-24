package com.xworks.crud;

import com.xworks.CricketTeamRunner;
import com.xworks.dto.CricketTeamDto;

import javax.persistence.*;
import java.util.Collection;

public class DeleteOperation {

    public static void main(String[] args) {
        EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("java");
        EntityManager entityManger = entityMangerFactory.createEntityManager();

        EntityTransaction transaction = entityManger.getTransaction();
        transaction.begin();
        String sqlQuery="delete from my_player_info where player_name='viratkohli'";
       // Query query = entityManger.createNamedQuery("sqlQuery1");
        //Query query = entityManger.createQuery(sqlQuery);//not maped exception for both create query and createnamedquery
        Query query = entityManger.createNativeQuery(sqlQuery);
        query.executeUpdate();
        transaction.commit();
        entityMangerFactory.close();
    }
}
