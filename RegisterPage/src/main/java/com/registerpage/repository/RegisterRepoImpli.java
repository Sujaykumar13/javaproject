package com.registerpage.repository;

import com.registerpage.entity.RegisterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

@Repository
public class RegisterRepoImpli implements RegisterRepoInterface{


    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean deleteById(Integer id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            Query query = entityManager.createNamedQuery("delete");
            query.setParameter("id",id);
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


        } catch (Exception e) {
            System.out.println("exception occur");
            System.out.println(e.getMessage());
            return false;
        }
        finally {
            entityManager.close();
        }
    }
    @Override
    public void saveData(RegisterEntity entity) {
        System.out.println(entity);
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(entity);
            transaction.commit();
        }
        catch (Exception e) {
            System.out.println("exception occurs");
        }finally {
            entityManager.close();
        }


    }

    @Override
    public List<RegisterEntity> fetchData() {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            Query query = entityManager.createNamedQuery("fetch");
            List<RegisterEntity> result = query.getResultList();
            transaction.commit();

            return result;

        } catch (Exception e) {
            System.out.println("exception occur");
            System.out.println(e.getMessage());
            return Collections.emptyList();
        }
        finally {
            entityManager.close();
        }

    }

    @Override
    public RegisterEntity findById(Integer id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            Query query = entityManager.createNamedQuery("findById");
            query.setParameter("id",id);
            RegisterEntity result = (RegisterEntity) query.getSingleResult();
            transaction.commit();
            return result;

        } catch (Exception e) {
            System.out.println("exception occur");
            System.out.println(e.getMessage());
            return null;
        }
        finally {
            entityManager.close();
        }

    }

    @Override
    public RegisterEntity findByEmail(String email) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            Query query = entityManager.createNamedQuery("findByEmail");
            query.setParameter("email",email);
            RegisterEntity result = (RegisterEntity) query.getSingleResult();
            transaction.commit();
            return result;

        } catch (Exception e) {
            System.out.println("exception occur");
            System.out.println(e.getMessage());
            return null;
        }
        finally {
            entityManager.close();
        }
    }

    @Override
    public void updateData(RegisterEntity entity) {
        System.out.println(entity);
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.merge(entity);
            transaction.commit();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            entityManager.close();
        }

    }
}
