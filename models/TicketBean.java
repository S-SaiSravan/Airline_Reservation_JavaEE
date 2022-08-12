package com.klef.ep.models;

import java.util.List;

import javax.ejb.*;
import javax.faces.bean.ManagedBean;

import com.klef.ep.services.TicketService;

@ManagedBean(name = "tickBean",eager = true)
public class TicketBean 
{
	
	
	List<Ticket> ticklist;
	
	@EJB(lookup = "java:global/EPAirlines/TicketServiceImpl!com.klef.ep.services.TicketService")
	TicketService ticketService;
	
	public List<Ticket> getTicklist() 
	{
		return ticketService.viewalltickets();
	}

	public void setTicklist(List<Ticket> ticklist) {
		this.ticklist =ticklist;
	}



	
	
	
	

	
}
