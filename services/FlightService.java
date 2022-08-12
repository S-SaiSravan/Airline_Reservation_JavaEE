package com.klef.ep.services;

import java.util.List;

import javax.ejb.Remote;

import com.klef.ep.models.Flight;
import com.klef.ep.models.Ticket;

@Remote
public interface FlightService
{
	public String AddFlight(Flight f);
	public String deleteflight(String fid);
	public List<Flight> viewallflights();
	
}