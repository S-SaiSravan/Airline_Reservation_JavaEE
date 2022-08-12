<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AirLines</title>
<link rel="stylesheet" type="text/css" href="paymentstyle.css">

</head>
<body>
<center>
<br><br>
<h2>Payment Gateway</h2>
<div class="id">
<form method = "post" action="bookingsuccess.jsp"> 
Card Type: &nbsp;&nbsp;
<select name="" required>
<option value="">--Select--</option>
<option value="AmericanExpress">AmericanExpress</option>
<option value="Visa">Visa</option>
<option value="Rupay">Rupay</option>
</select>  <br><br>
Card HolderName:<input type="text" name= "" requried /><br><br>
Card Number:<input type="text" name= ""requried/><br><br>
EXPIRY:<input type="text" name= ""requried/><br><br>
CVV:<input type="number" name= ""requried/><br><br>
Number<input type="number" name= ""requried/><br><br>

<input type="submit" value="Pay"/>
</form>
</center>
</body>
</html>