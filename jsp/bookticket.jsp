<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Airlines</title>
<link rel="stylesheet" type="text/css" href="bookticketstyle.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">

</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>

<h2 align=center><u>BOOK YOUR TICKET</u></h2><br>
<center>
<button><a href="PassengerDashboard.jsp">Home</a>&nbsp;&nbsp;&nbsp;</button>
<button><a href="ContactUs.jsp">Contact</a>&nbsp;&nbsp;&nbsp;</button>
<button><a href="home.jsp">Logout</a>&nbsp;&nbsp;&nbsp;</button>
</center>


<center>
<div class="id">
<form method="post" action="bookticket">
Name of the Passenger: <input type="text" name="pbname" required> <br><br>    
Mobile No:  <input type="number" name="pbmob" required><br><br>
Gender :
Male<input type="radio" name="pbgender" value="male" required>
Female<input type="radio" name="pbgender" value="female" required><br><br>
Email: <input type="email" name="pbemail" required><br><br>
Boarding Point: &nbsp;&nbsp;
<select name="pbdpoint" required>
<option value="">--Select--</option>
<option value="India">India</option>
<option value="Australia">Australia</option>
<option value="London">London</option>
<option value="Germany">Germany</option>
</select> <br> <br>
Destination Point: &nbsp;&nbsp;
<select name="pdpoint" required>
<option value="">--Select--</option>
<option value="India">India</option>
<option value="Australia">Australia</option>
<option value="London">London</option>
<option value="Germany">Germany</option>
</select>  <br><br>
Age: <input type="number" name="pbage" required><br><br>
Date: <input type="text" name="pbdate" required> <br><br><br>

<input type="submit" value="BOOK">
 </form>
 </div>
</center>
</body>
</html>