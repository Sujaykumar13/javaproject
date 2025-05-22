package com.modules.repository;

import com.modules.entity.LoginEntity;
import com.modules.entity.RegistrationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

@Repository
public class RegistrationRepoImpli implements RegistrationRepoInterface{

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public void saveData(RegistrationEntity entity) {

        System.out.println("entity in repo"+entity);
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(entity);
            transaction.commit();
        }
        catch (Exception e) {
            System.out.println("exception occurs");
            System.out.println(e.getMessage());
        }finally {
            entityManager.close();
        }

    }

    @Override
    public RegistrationEntity findByEmail(String email) {

        System.out.println(email);
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            Query query = entityManager.createNamedQuery("findByEmail");
            query.setParameter("email",email);
            RegistrationEntity result = (RegistrationEntity) query.getSingleResult();
            transaction.commit();
            System.out.println("result================"+result);
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
    public RegistrationEntity findByMobileNumber(Long mobileNumber) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            Query query = entityManager.createNamedQuery("findByMobileNumber");
            query.setParameter("contactNumber",mobileNumber);
            RegistrationEntity result = (RegistrationEntity) query.getSingleResult();
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
    public void login(LoginEntity entity) {

        System.out.println(" login entity in repo"+entity);
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.merge(entity);
            transaction.commit();
        }
        catch (Exception e) {
            System.out.println("exception occurs");
        }finally {
            entityManager.close();
        }

    }

    @Override
    public void loginUpdate(RegistrationEntity entity) {
        System.out.println("entity in repo"+entity);
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.merge(entity);
            transaction.commit();
        }
        catch (Exception e) {
            System.out.println("exception occurs");
            System.out.println(e.getMessage());
        }finally {
            entityManager.close();
        }

    }

    @Override
    public void saveOtp(RegistrationEntity entity) {

        System.out.println("entity in repo"+entity);
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.merge(entity);
            transaction.commit();
        }
        catch (Exception e) {
            System.out.println("exception occurs");
            System.out.println(e.getMessage());
        }finally {
            entityManager.close();
        }

    }

    @Override
    public void resetPassword(RegistrationEntity entity) {

        System.out.println("entity in repo"+entity);
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.merge(entity);
            transaction.commit();
        }
        catch (Exception e) {
            System.out.println("exception occurs");
            System.out.println(e.getMessage());
        }finally {
            entityManager.close();
        }


    }

    @Override
    public LoginEntity findLoginDetails(String email) {
        System.out.println(email);
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            Query query = entityManager.createNamedQuery("findloginDetails");
            query.setParameter("email",email);
            LoginEntity result = (LoginEntity) query.getSingleResult();
            transaction.commit();
            System.out.println("result================"+result);
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
    public void logout(LoginEntity entity) {

        System.out.println(" login entity in repo"+entity);
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.merge(entity);
            transaction.commit();
        }
        catch (Exception e) {
            System.out.println("exception occurs");
        }finally {
            entityManager.close();
        }

    }

    @Override
    public void updateData(RegistrationEntity entity) {
        System.out.println("entity in repo"+entity);
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.merge(entity);
            transaction.commit();
        }
        catch (Exception e) {
            System.out.println("exception occurs");
            System.out.println(e.getMessage());
        }finally {
            entityManager.close();
        }

    }
}
