package com.klef.ep.services;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.klef.ep.models.Passenger;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class PassengerServiceImpl implements PassengerService
{

	@Override
	public String passengerRegistration(Passenger p) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    entityManager.persist(p);
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
	    
	    return "Registration Successfull";
	    
	}

	@Override
	public Passenger passengerLogin(String puname, String pwd) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    Query qry=entityManager.createQuery("select p from Passenger p where puname=? and  pwd=?");
	    qry.setParameter(1, puname);
	    qry.setParameter(2, pwd);
	    
	    Passenger p = null;
	    
	    if (qry.getResultList().size()==1) 
	    {
	    	p = (Passenger) qry.getSingleResult();
	    }
	    
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
	    
	    return p;
	}

}
