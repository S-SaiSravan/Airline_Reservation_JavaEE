<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>About Us Page</title>
    <style>
        .column {
            float: left;
            width: 23.6%;
            padding: 5px;
          }
          
          /* Clear floats after image containers */
          .row::after {
            content: "";
            clear: both;
            display: table;
          }
          * {
            box-sizing: border-box;
            background-color: whitesmoke;
          }
          
          body {
            font-family: Arial, Helvetica, sans-serif;
          }
          
          /* Float four columns side by side */
          .column {
            float: left;
            width: 25%;
            padding: 0 10px;
          }
          
          /* Remove extra left and right margins, due to padding in columns */
          .row {margin: 0 -5px;}
          
          /* Clear floats after the columns */
          .row:after {
            content: "";
            display: table;
            clear: both;
          }
          
          /* Style the counter cards */
          .card {
            box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2); /* this adds the "card" effect */
            padding: 16px;
            text-align: center;
            background-color: #f1f1f1;
          }
          
          /* Responsive columns - one column layout (vertical) on small screens */
          @media screen and (max-width: 600px) {
            .column {
              width: 100%;
              display: block;
              margin-bottom: 20px;
            }
          }





          .card {
            box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
            max-width: 25%;
            margin: auto;
            text-align: center;
            float: left;
            padding: 10 100px;
            margin: 50px;
          }
          
          .rolebased {
            color: grey;
            font-size: 20px;
            
          }
          
          button {
            border: none;
            outline: 0;
            display: inline-block;
            padding: 8px;
            color: white;
            background-color: #000;
            text-align: center;
            cursor: pointer;
            width: 100%;
            font-size: 18px;
          }
          
          a {
            text-decoration: none;
            font-size: 22px;
            color: black;
          }
          
          button:hover, a:hover {
            opacity: 0.7;
          }

          .profilecards{
            margin-left: 0%;
            
          }
          li {
  display: inline;
}
          nav{
          a {
  display: block;
  padding: 8px;
  background-color: #dddddd;
}
          }

          









    </style>
  
</head>
<body>
 
    <center>
           <center>
    <button>  <a href="home.jsp">HOME</a>&nbsp;&nbsp;</button>
    <button>   <a href="Aboutus.jsp">ABOUT OUR PROJECT</a>&nbsp;&nbsp;</button>
     <button>  <a href="PassengerLogin.jsp">PASSENGER LOGIN</a>&nbsp;&nbsp;</button>
     <button>  <a href="AgentLogin.jsp">ADMIN LOGIN</a>&nbsp;&nbsp;</button>
     <button>   <a href="ContactUs.jsp">CONTACT US</a>&nbsp;&nbsp;</button> <br> <br>
      
    </center>
        <img src='klu.jpg' width="500px"/>
        <br></br>
        <p id="TeamHeading">ENTERPRISE PROGRAMMING | 23 </p>
         <div id="aboutcontentbox">
         <p  >We are CSE sophomores from KL University pursuing our Bachelor’s in Technology. 
         We will be implementing concepts that we have learnt in the Enterprise Programming Course.
         The objective of this project is to develop a AirLine Reservation application.</p>
        





                <div class="profilecards">

                <div class="card">
                  <img src="sravan.jpg" alt="sravan" style="width:100%">
                  <h1>S Sai Sravan</h1>
                  <h3 class="rolebased">Front End Developer</h3>
                  <p>KL University</p>
                  <a href="https://github.com/S-SaiSravan"><i class="fa fa-github"></i></a>
                  
                  <a href="https://www.linkedin.com/in/s-sai-sravan-6b13b1213/"><i class="fa fa-linkedin"></i></a>
                  <a href="#"><i class="fa fa-instagram"></i></a>
                  <p><button>Contact</button></p>
                </div>
                <div class="card">
                  <img src="nirupam.jpg" alt="msn" style="width:100%">
                  <h1>M Sai Nirupam </h1>
                  <h3 class="rolebased">Team Lead</h3>
                  <p>KL University</p>
                  <a href="https://github.com/NirupamMallem"><i class="fa fa-github"></i></a>
                  
                  <a href="https://www.linkedin.com/in/mallem-sai-nirupam-3b86a3215/"><i class="fa fa-linkedin"></i></a>
                  <a href="#"><i class="fa fa-instagram"></i></a>
                  <p><button>Contact</button></p>
                </div>

                <div class="card">
                  <img src="aakash.jpg" alt="Aakash" style="width:100%">
                  <h1>T Aakash Chandra</h1>
                  <h3 class="rolebased">Backend Developer </h3>
                  <p>KL University</p>
                  <a href="https://github.com/Thatishetty"><i class="fa fa-github"></i></a>
                  
                  <a href="https://www.linkedin.com/in/thatishetty-aakash-chandra/"><i class="fa fa-linkedin"></i></a>
                  <a href="#"><i class="fa fa-instagram"></i></a>
                  <p><button>Contact</button></p>
                </div>
              </div>


                  </div>
          
                </div> 
              </section>


    

                
         
    </center>

</body>

</html>