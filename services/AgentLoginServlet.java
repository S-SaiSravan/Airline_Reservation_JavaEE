	package com.klef.ep.services;

import java.io.*;
import javax.ejb.*;
import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.klef.ep.models.AirlineAgent;

@WebServlet("/agentlogin")
public class AgentLoginServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@EJB(lookup = "java:global/EPAirlines/AgentServiceImpl!com.klef.ep.services.AgentService")
	AgentService agentService;
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
  {
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
     
      String aname=request.getParameter("aname");
      String awd=request.getParameter("awd");
      
      AirlineAgent a = agentService.AgentLogin(aname, awd);
      
      if(a!=null)
      {
    	  response.sendRedirect("AgentDashboard.jsp");
      }
      else
      {
//    	  out.println("Login Failed");
    	  response.sendRedirect("AgentLogin.jsp");
      }
  }
}