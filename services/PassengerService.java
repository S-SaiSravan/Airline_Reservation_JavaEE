package com.klef.ep.services;

import javax.ejb.Remote;

import com.klef.ep.models.Passenger;

@Remote
public interface PassengerService
{
	public String passengerRegistration(Passenger p);
	public Passenger passengerLogin(String puname,String pwd);
	
}