<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EP Airlines</title>
<link rel="stylesheet" type="text/css" href="Passengerregstyle.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">

</head>
<body>

<br><br>
<h2 align = "center">Create Your Account</h2>
<center>
<div class="id">
<form method = "post" action="passreg"> 
Full Name<input type="text" name= "pname" requried /><br><br>
Gender Male<input type="radio" name= "gender" value="male"requried/>
Female<input type="radio" name= "gender" value="female"requried/><br><br>
Age<input type="text" name= "age" requried /><br><br>
Email<input type="email" name= "email"requried/><br><br>
User Name<input type="text" name= "puname"requried/><br><br>
Password<input type="password" name= "pwd"requried/><br><br>
Number<input type="number" name= "mob"requried/><br><br>

<input type="submit" value="Register"/>
</form>
<br>
<button><a href="home.jsp">HOME</a></button>
</div>
</center>
</body>
</html>