package com.klef.ep.services;

import java.util.List;

import com.klef.ep.models.Ticket;

public interface TicketService {
	
	public String bookticket(Ticket t);
	public List<Ticket> viewalltickets();
	public List<Ticket> tracktickets(String id);
}
