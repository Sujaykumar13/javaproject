package com.xworks.spring.repository;

import com.xworks.spring.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Repository
public class RepositoryImpli implements RepositoryInterface{

    @Autowired
    EntityManagerFactory entityManagerFactory;
    @Override
    public void saveData(StudentEntity entity) {
        System.out.println(entity);
        //EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("java");
        EntityManager entityManger = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManger.getTransaction();
            transaction.begin();
            entityManger.persist(entity);
            transaction.commit();
        } catch (Exception e) {

            System.out.println("exception occur");

        }finally {
            entityManger.close();
        }
    }

    @Override
    public List<StudentEntity> fetchData() {
        System.out.println("fetch the data from data base");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query1 = entityManager.createNamedQuery("query");
        List<StudentEntity> result = query1.getResultList();
        System.out.println(result);
        return result;
    }

    @Override
    public StudentEntity findDataById(Integer id) {
        EntityManager entityManger = entityManagerFactory.createEntityManager();
        Query query1 = entityManger.createNamedQuery("query1");
        query1.setParameter("id",id);
        StudentEntity result = (StudentEntity) query1.getSingleResult();
        System.out.println(result);
        return result;
    }

    @Override
    public void updateData(StudentEntity entity) {
        System.out.println(entity);
        //EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("java");
        EntityManager entityManger = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManger.getTransaction();
            transaction.begin();
            entityManger.merge(entity);//to update the existing record in database we use merge
            transaction.commit();
        } catch (Exception e) {

            System.out.println("exception occur");

        }finally {
            entityManger.close();
        }
    }

    @Override
    public boolean deleteDataRepo(Integer id) {
        System.out.println(id);
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try{
            //EntityManager entityManager = entityManagerFactory.createEntityManager();
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            Query query = entityManager.createNamedQuery("delete");
            query.setParameter("iid",id);
            int result = query.executeUpdate();
            transaction.commit();
            System.out.println(result);
            if(result==1)
            {
                return true;
            }
            else {
                return false;
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("exception occur");

        }finally {
            entityManager.close();
        }
        return false;
    }
}
