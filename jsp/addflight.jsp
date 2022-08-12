<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Airlines</title>
    <link rel="stylesheet" type="text/css" href="addflightstyle.css">
</head>
<body>

<h2 align=center><u> ADD A FLIGHT</u></h2><br>
<center>
<button><a href="AgentDashboard.jsp">Home</a>&nbsp;&nbsp;&nbsp;</button>
<button><a href="ContactUs.jsp">Contact</a>&nbsp;&nbsp;&nbsp;</button>
<button><a href="home.jsp">Logout</a>&nbsp;&nbsp;&nbsp;</button>
</center>

<center>
<div class="id">
<form method="post" action="addflight">
Name of the Airline: <input type="text" name="airlinename" required> <br><br>  
Flight ID: <input type="text" name="fid" required> <br><br> 
Boarding Point: &nbsp;&nbsp;
<select name="fspoint" required>
<option value="">--Select--</option>
<option value="India">India</option>
<option value="Australia">Australia</option>
<option value="London">London</option>
<option value="Germany">Germany</option>
</select> <br> <br>
Destination Point: &nbsp;&nbsp;
<select name="fdpoint" required>
<option value="">--Select--</option>
<option value="India">India</option>
<option value="Australia">Australia</option>
<option value="London">London</option>
<option value="Germany">Germany</option>
</select>  <br><br>
Seating Capacity: <input type="number" name="fcapacity" required><br><br>
Date: <input type="text" name="fjdate" required> <br><br><br>

<input type="submit" value="ADD">
 </form>
 </div>

</body>
</html>