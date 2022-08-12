package com.klef.ep.services;

import java.io.*;

import javax.ejb.*;
import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.klef.ep.models.Ticket;
import com.klef.ep.services.*;

@WebServlet("/bookticket")
public class BookTicketServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@EJB(lookup = "java:global/EPAirlines/TicketServiceImpl!com.klef.ep.services.TicketService")
	TicketService ticketservice;
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
  {
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
     
      String pbname=request.getParameter("pbname");
      String pbmob=request.getParameter("pbmob");
      String pbgender=request.getParameter("pbgender");
      String pbemail=request.getParameter("pbemail");
      String pbuname=request.getParameter("pbuname");
      String pbdpoint=request.getParameter("pbdpoint");
      String pdpoint =request.getParameter("pdpoint");
      int pbage=Integer.parseInt(request.getParameter("pbage"));
      String pbdate=request.getParameter("pbdate");
      
      Ticket t=new Ticket();
      t.setPbname(pbname);
      t.setPbgender(pbgender);
      t.setPbmob(pbmob);
      t.setPbemail(pbemail);
      t.setPbuname(pbuname);
      t.setPbdate(pbdate);
      t.setPbage(pbage);
      t.setPbdpoint(pbdpoint);
      t.setPdpoint(pdpoint);
      System.out.println(t.toString());
      String result=ticketservice.bookticket(t);
      response.sendRedirect("bookingsuccess.jsp");
  }
}