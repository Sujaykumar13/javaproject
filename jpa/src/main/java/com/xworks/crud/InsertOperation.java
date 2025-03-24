package com.xworks.crud;

import javax.persistence.*;

public class InsertOperation {

    public static void main(String[] args) {
        EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("java");
        EntityManager entityManger = entityMangerFactory.createEntityManager();

        EntityTransaction transaction = entityManger.getTransaction();
        transaction.begin();
        String sqlQuery="insert into my_player_info values(18, 'viratkohli', 'batter','delhi','1988-11-06',119,9012)";
        //Query query = entityManger.createQuery(sqlQuery);//it is not possible
        //Query query = entityManger.createNamedQuery("sqlQuery2");//it is not possible
        Query query = entityManger.createNativeQuery(sqlQuery);
        query.executeUpdate();
        transaction.commit();
        entityMangerFactory.close();
    }
}
