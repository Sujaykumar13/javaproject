package com.xworks.crud;

import javax.persistence.*;

public class UpdateOperation {

    public static void main(String[] args) {
        EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("java");
        EntityManager entityManger = entityMangerFactory.createEntityManager();

        EntityTransaction transaction = entityManger.getTransaction();
        transaction.begin();
        String sqlQuery="update my_player_info set jersey_Num=3 where player_name='suresh'";
        //Query query = entityManger.createQuery(sqlQuery);//it is not possible
        //Query query = entityManger.createNamedQuery("sqlQuery3");//it is not possible
        Query query = entityManger.createNativeQuery(sqlQuery);
        query.executeUpdate();
        transaction.commit();
        entityMangerFactory.close();
    }
}
