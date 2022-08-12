package com.klef.ep.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.klef.ep.models.Flight;
import com.klef.ep.models.Ticket;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class FlightServiceImpl implements FlightService
{

	@Override
	public String AddFlight(Flight f) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    entityManager.persist(f);
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
	    
	    return "Flight Added Successfully";
	    
	}

	@Override
	public List<Flight> viewallflights() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    Query qry=entityManager.createQuery("select flight from Flight flight");
	    List<Flight> flylist=qry.getResultList();
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
	    
	    return flylist;
	}
	@Override
	  public String deleteflight(String fid) 
	  {
	    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
	      EntityManager entityManager = entityManagerFactory.createEntityManager();
	      
	      
	      entityManager.getTransaction().begin();
	      Flight f=entityManager.find(Flight.class,fid);
	      entityManager.remove(f);
	      entityManager.getTransaction().commit();
	      
	      entityManager.close();
	      entityManagerFactory.close();
	      
	      return "Flight deleted Successfully";
	    
	  }


}
