<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.klef.ep.models.*"  %>
<%
String passname = (String)request.getAttribute("passname");
String passmob = (String)request.getAttribute("passmob");
String passgen =(String) request.getAttribute("passgen");
String passemail =(String) request.getAttribute("passemail");
String passuname =(String) request.getAttribute("passuname");
String passbdpoint =(String) request.getAttribute("passbdpoint");
String passdpoint =(String) request.getAttribute("passdpoint");
int passage =(int)request.getAttribute("passage");
String passdate =(String) request.getAttribute("passdate");




%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,700' rel='stylesheet' type='text/css'></link>

  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"></link>
  
  <link rel="stylesheet" href="navbarcss/style.css"></link>
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" ></link>


<title>View Your Ticket</title>
</head>
<body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" ></script>
<nav class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light" id="ftco-navbar">
      <div class="container-fluid">
      
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="fa fa-bars"></span> Menu
        </button>

      </div>
    </nav>
<center>
<h3>View your Ticket Details</h3>
<table border="2px solid red" class="table table-light table-hover">
<tr><th>Name</th>
<th>Mobile</th>
<th>Gender</th>
<th>UserName</th>
<th>Source</th>
<th>Destination</th>
<th>Age</th>
<th>Date</th>
</tr>
<th>
<tr>
<td widt> <%=passname %> </td>
<td> <%=passmob %> </td>
<td> <%=passgen %> </td>
<td> <%=passemail %> </td>
<td> <%=passbdpoint %> </td>
<td> <%=passdpoint %> </td>
<td> <%= passage%> </td>
<td> <%=passdate %> </td>
</tr>


</table>
  
</center>
</body>
</html>