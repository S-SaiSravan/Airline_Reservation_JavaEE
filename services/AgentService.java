package com.klef.ep.services;

import javax.ejb.Remote;

import com.klef.ep.models.AirlineAgent;

@Remote
public interface AgentService
{

	public AirlineAgent AgentLogin(String aname,String awd);
	
}