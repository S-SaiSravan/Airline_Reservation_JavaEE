package com.klef.ep.services;

import java.io.*;


import javax.ejb.*;
import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.klef.ep.models.Passenger;

@WebServlet("/passreg")
public class PassengerRegServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@EJB(lookup = "java:global/EPAirlines/PassengerServiceImpl!com.klef.ep.services.PassengerService")
	PassengerService passengerService;
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
  {
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
     
      String pname=request.getParameter("pname");
      String gender=request.getParameter("gender");
      String age=request.getParameter("age");
      String email=request.getParameter("email");
      String puname=request.getParameter("puname");
      String pwd=request.getParameter("pwd");
      String mob=request.getParameter("mob");
      
      Passenger p=new Passenger();
      p.setPname(pname);
      p.setGender(gender);
      p.setAge(age);
      p.setEmail(email);
      p.setPuname(puname);
      p.setPwd(pwd);
      p.setMob(mob);
      System.out.println(p.toString());
      String result=passengerService.passengerRegistration(p);
      response.sendRedirect("PassengerLogin.jsp");
  }
}