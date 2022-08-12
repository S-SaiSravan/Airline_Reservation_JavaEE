package com.klef.ep.services;

import java.io.*;
import javax.ejb.*;
import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.klef.ep.models.Passenger;

@WebServlet("/passlogin")
public class PassengerLoginServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@EJB(lookup = "java:global/EPAirlines/PassengerServiceImpl!com.klef.ep.services.PassengerService")
	PassengerService passengerService;
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
  {
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
     
      String puname=request.getParameter("puname");
      String pwd=request.getParameter("pwd");
      
      System.out.println(puname+","+pwd);
      
      Passenger p = passengerService.passengerLogin(puname, pwd);
      System.out.println("I am in Passenger Login Servlet");
      System.out.print(p.getPname());
      
      if(p!=null)
      {
    	  
    	  response.sendRedirect("PassengerDashboard.jsp");
    	  
       }
      else
      {
    	  out.println("Login Failed");
      }
  }
}