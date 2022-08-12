package com.klef.ep.services;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.klef.ep.models.AirlineAgent;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class AgentServiceImpl implements AgentService
{

	@Override
	public AirlineAgent AgentLogin(String aname, String awd) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    Query qry=entityManager.createQuery("select a from AirlineAgent a where agname=? and  agpwd=?");
	    qry.setParameter(1, aname);
	    qry.setParameter(2, awd);
	    
	     AirlineAgent a = null;
	    
	    if (qry.getResultList().size()==1) 
	    {
	    	a = (AirlineAgent) qry.getSingleResult();
	    }
	    
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
	    
	    return a;
	}

}
