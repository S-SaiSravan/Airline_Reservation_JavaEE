package com.klef.ep.models;

import java.util.List;

import javax.ejb.*;
import javax.faces.bean.ManagedBean;

import com.klef.ep.services.FlightService;

@ManagedBean(name = "flyBean",eager = true)
public class FlightBean 
{
	
	private String airlinename;
	private String fid;
	private String fspoint;
	private String fdpoint;
	private int fcapacity;
	private String response;
	List<Flight> flylist;
	
	@EJB(lookup = "java:global/EPAirlines/FlightServiceImpl!com.klef.ep.services.FlightService")
	FlightService flightService;
	
	public List<Flight> getFlylist() 
	{
		return flightService.viewallflights();
	}

	public void setFlylist(List<Flight> flylist) {
		this.flylist =flylist;
	}
	public void deleteflight(String fid)
	  {
	    try
	    {
	      response=flightService.deleteflight(fid);
	    }
	    catch(Exception e)
	    {
	      response=e.getMessage();
	    }
	  }

	public String getAirlinename() {
		return airlinename;
	}

	public void setAirlinename(String airlinename) {
		this.airlinename = airlinename;
	}

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public String getFspoint() {
		return fspoint;
	}

	public void setFspoint(String fspoint) {
		this.fspoint = fspoint;
	}

	public String getFdpoint() {
		return fdpoint;
	}

	public void setFdpoint(String fdpoint) {
		this.fdpoint = fdpoint;
	}

	public int getFcapacity() {
		return fcapacity;
	}

	public void setFcapacity(int fcapacity) {
		this.fcapacity = fcapacity;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public FlightService getFlightService() {
		return flightService;
	}

	public void setFlightService(FlightService flightService) {
		this.flightService = flightService;
	}


	
	
	
	

	
}
