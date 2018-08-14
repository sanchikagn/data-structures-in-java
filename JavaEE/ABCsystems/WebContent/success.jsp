<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
<style>
.sac{
background-image:url("images/success.jpg");
background-size:cover;
}
.container{
padding: 80px 120px;
}
.cas {
      background: #000d1a;
      color: #bdbdbd;
  }
  .cas h3 {color:#5c8a8a;}
  .carousel-inner img {
     
      width: 100%; /* Set width to 100% */
      margin: auto;
  }
  .btn{
     background-color:#000d1a;
}
.navbar {
      background-color:#000d1a;
      border: 0;
      font-size: 11px;
      letter-spacing: 4px;
      opacity: 0.9;
  }
  .navbar li a, .navbar .navbar-brand {
      color: #d5d5d5 ;
  }
  .navbar-nav li a:hover {
 background-color:white;
 }

 </style>

</head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
</head>
<body >

<nav class="navbar navbar navbar-fixed-top" data-spy="scroll">
  <div class="container-fluid">

       <a class="navbar-brand" href="Home.jsp" >ABC</a>
    
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
       
        <li><a href="#services">SERVICES</a></li>
        <li><a href="#contact">CONTACT</a></li>
        
      </ul>
    </div>
  </div>
</nav>

<div class="sac">
<div class="container text-center " id="about">
  <h1>Order Successful!!</h1>
  <h2>Thank for purchasing our product.<br/>Your order as been successfuly placed.<br/>
You will receive your item in registered post within 2-3 weeks.</h2>
  </div>
</div>
<div id="tour" class="cas">
 
  <div class="container" id="services">
    <div class="row text-center">
	 <h3>See More - ABC!!</h3>
      <div class="col-sm-4">
        <div class="thumbnail">
          <img src="img/Laptop.jpg" alt="Paris" width="400" height="300">
         <p><strong>Computers & Laptop</strong></p>
         
          <a href="lap.jsp"> <button class="btn" ">Search</button></a>
        </div>
      </div>
      <div class="col-sm-4">
        <div class="thumbnail">
          <img src="img/TV.jpg" alt="New York" width="400" height="300">
          <p><strong>TV, Audio & Surveillance</strong></p>
          
          <a href="tv.jsp"><button class="btn">Search</button></a>
        </div>
      </div>
      <div class="col-sm-4">
        <div class="thumbnail">
          <img src="img/3.jpg" alt="San Francisco" width="400" height="300">
          <p><strong>Cameras</strong></p>
        
          <a href="cam.jsp"><button class="btn">Search</button></a>
        </div>
      </div>
    </div>
	 <div class="row text-center">
      <div class="col-sm-2">
       
      </div>
      
      
	   <div class="col-sm-2">
        
      </div>
    </div>
  </div>
  </div>
  <div class="container" id="contact">
  <div class="row">
    <div class="col-sm-5">
      <h2>Contact us </h2>
      <p><span class="glyphicon glyphicon-map-marker"></span> Colombo, SriLanka</p>
      <p><span class="glyphicon glyphicon-phone"></span> +94-11-2341541</p>
      <p><span class="glyphicon glyphicon-envelope"></span> tronicmart@hotmail.com</p>
    </div>
    <div class="col-sm-7">
      <div class="row">
        <div class="col-sm-6 form-group">
          <input class="form-control" id="name" name="name" placeholder="Name" type="text" required>
        </div>
        <div class="col-sm-6 form-group">
          <input class="form-control" id="email" name="email" placeholder="Email" type="email" required>
        </div>
      </div>
      <textarea class="form-control" id="comments" name="comments" placeholder="Comment" rows="5"></textarea><br>
      <div class="row">
        <div class="col-sm-12 form-group">
          <button class="btn btn-primary pull-right" type="submit">Send</button>
        </div>
      </div>
    </div>
  </div>
</div>
</div>
</body>
</html>