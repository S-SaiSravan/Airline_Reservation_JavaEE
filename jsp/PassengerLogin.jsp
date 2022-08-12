<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Airlines</title>
<!-- CSS only -->

<link rel="stylesheet" type="text/css" href="loginstyle.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">

</head>
<body >
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>

    <center>
<nav class="navbar navbar-dark bg-dark">
<a href="home.jsp">HOME</a>&nbsp;&nbsp;
      <a href="Aboutus.jsp">ABOUT OUR PROJECT</a>&nbsp;&nbsp;
      <a href="PassengerLogin.jsp">USER LOGIN</a>&nbsp;&nbsp;
      <a href="AgentLogin.jsp">ADMIN LOGIN</a>&nbsp;&nbsp;
       <a href="ContactUs.jsp">CONTACT US</a>&nbsp;&nbsp;
</nav>

    </center>
    <br><br>

<h3 align=center><u> Login to your account</u></h3>
<center>
<div class="id">
<form method="post" action="passlogin">

Username&nbsp;&nbsp;<input type="text" name="puname" required><br><br>
Password&nbsp;&nbsp;<input type="password" name="pwd" required><br><br> 

<input type="submit" value="Login">

</form>
</div>
</center>

</div>
<center>Don't Have Account <button><a href="PassengerRegistration.jsp">Click Here</a></button></center>

</div>
</body>
</html>