package com.klef.ep.services;

import java.io.*;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.klef.ep.models.Ticket;

@WebServlet("/tracking")
public class TrackingServlet extends HttpServlet
{
  private static final long serialVersionUID = 1L;
  @EJB(lookup = "java:global/EPAirlines/TicketServiceImpl!com.klef.ep.services.TicketService")
  TicketService ticketService;
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
  {
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
     
      String id=request.getParameter("id");
      
      List<Ticket> ticklist = ticketService.tracktickets(id);
      Ticket t;

//      for(Ticket tick: ticklist)
//      {
//    	  out.println(tick.getPbname());
//    	  out.println(tick.getPbage());
//    	  out.println(tick.getPbemail());
//      }
      for (Ticket tick : ticklist)
      {
        request.setAttribute("passname", tick.getPbname());
        request.setAttribute("passmob",tick.getPbmob());
        request.setAttribute("passgen",tick.getPbgender());
        request.setAttribute("passemail",tick.getPbemail());
        request.setAttribute("passuname", tick.getPbuname());
        request.setAttribute("passbdpoint",tick.getPbdpoint());
        request.setAttribute("passdpoint",tick.getPdpoint());
        request.setAttribute("passage", tick.getPbage());
        request.setAttribute("passdate", tick.getPbdate());

      }
     
      RequestDispatcher rd = request.getRequestDispatcher("ticketviewer.jsp");
      rd.include(request, response);

  }
}