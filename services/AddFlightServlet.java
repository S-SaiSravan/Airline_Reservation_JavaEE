package com.klef.ep.services;

import java.io.*;


import javax.ejb.*;
import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.klef.ep.models.Flight;
import com.klef.ep.models.Ticket;
@WebServlet("/addflight")
public class AddFlightServlet extends HttpServlet
{
	private static final long serialVersionUID= 1L;
	@EJB(lookup = "java:global/EPAirlines/FlightServiceImpl!com.klef.ep.services.FlightService")
	FlightService flightservice;
	 public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	  {
	      response.setContentType("text/html");
	      PrintWriter out=response.getWriter();
	     
	      String airlinename=request.getParameter("airlinename");
	      String fid=request.getParameter("fid");
	      String fspoint=request.getParameter("fspoint");
	      String fdpoint =request.getParameter("fdpoint");
	      int fcapacity=Integer.parseInt(request.getParameter("fcapacity"));
	      String fjdate=request.getParameter("fjdate");
	      
	      Flight f=new Flight();
	      f.setAirlinename(airlinename);
	      f.setFid(fid);
	      f.setFspoint(fspoint);
	      f.setFdpoint(fdpoint);
	      f.setFcapacity(fcapacity);
	      f.setFjdate(fjdate);
	      System.out.println(f.toString());
	      String result=flightservice.AddFlight(f);
	      response.sendRedirect("addflightsuccess.jsp");
	  }
	

}