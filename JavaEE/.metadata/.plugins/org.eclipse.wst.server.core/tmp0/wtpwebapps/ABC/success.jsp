<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*" import="com.abcsystems.products.HelloForm" import="com.abcsystems.products.Product"
	 import="com.abcsystems.products.BuyItNow"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>Web Service Shopping Cart</title>
<link href="${pageContext.request.contextPath}/css/bootstrap.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/shop-homepage1.css"
	rel="stylesheet">
</head>
<body>
	<!-- Navigation -->
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				
			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<nav class="navbar navbar navbar-fixed-top" data-spy="scroll">
  <div class="container-fluid">

       <a class="navbar-brand" href="Home.jsp" >ABC</a>
    
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
         <li>
                        <a class="page-scroll" href="phone.jsp">Phones & Tablets</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="lap.jsp">Laptops & Computers</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="cam.jsp">Cameras</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="tv.jsp">TV, Audio & Surveillance</a>
                    </li>
					<li>
                        <a class="page-scroll" href="vehicle.jsp">Vehicle Electronics & GPS</a>
                    </li>
        
      </ul>
    </div>
  </div>
</nav>
		</div>
		<!-- /.container -->
	</nav>
	
<!-- Page Content -->
<div class="container">
<!-- Portfolio Item Heading -->
<div class="row">
<div class="col-lg-12">
<h1 class="page-header">Successfully Ordered
<font color="#5cb85c"></font>
</h1>
</div>
</div>
<!-- /.row -->
<!-- Portfolio Item Row -->
<div class="row">
<div class="col-md-4">
<img class="img-responsive" src="${pageContext.request.contextPath}/images/apple.jpg" alt="">
</div>
<div class="col-md-8">
<h3 class="success_message">${username} !!
Thank you for purchasing this product! Your order has been successfuly placed.
You will receive your item in registered post within 2-3 weeks.
<br/>
</h3>
<h3 class="success_message">Check your details are correct : </h3>
<h4>Name : ${username}</h4>
<h4>Mobile Number : ${userphoneno}</h4>
<p>
---------------------------------------------------------------------------------------------------------------------------------------------
</p>
<h4>
<br/>
For more information call our customer support:
<br/><br/>
+123 664 4452
</h4>
</div>
</div>
<!-- /.row -->
</div>
<!-- /.container -->


<div class="container">
		<hr>
		<!-- Footer -->
		<footer>
			<div class="row">
				<div class="col-lg-12">
					<p>ABC company copyright</p>
				</div>
			</div>
		</footer>
	</div>
	<!-- /.container -->
	<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</body>
</html>