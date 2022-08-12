<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EP Airlines</title>
<link rel="stylesheet" type="text/css" href="contactstyle.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">

</head>
<body>
    <center>
    <br>
    <nav class="navbar navbar-dark bg-dark">
     <a href="home.jsp">HOME</a>&nbsp;&nbsp;
      <a href="">ABOUT OUR PROJECT</a>&nbsp;&nbsp;
      <a href="PassengerLogin.jsp">USER LOGIN</a>&nbsp;&nbsp;
      <a href="AgentLogin.jsp">ADMIN LOGIN</a>&nbsp;&nbsp;
       <a href="ContactUs.jsp">CONTACT US</a>&nbsp;&nbsp;
       </nav>
    <div class="id">
    
     
    <h2 align=center><u>Hey Lets Talk!</u></h2><br>

<center>
<form method="post" action="Response.jsp"> 
Mobile Number:<input type ="number" name=""><br> <br>
Your Email <input type="email" name="" required><br><br>
We Would Love To Hear From You
<textarea name="loc" required></textarea><br> <br>
<input type="submit" value="Submit"> 
 </form>
</center>  
      </div>
    

</body>
</html>