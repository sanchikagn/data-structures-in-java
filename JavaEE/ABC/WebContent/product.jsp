<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*" import="com.abcsystems.products.BuyItNow"  import="com.abcsystems.products.Product"%>
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
<link href="${pageContext.request.contextPath}/css/shop-homepage.css"
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
				<h1 class="page-header">${itemname}
				<small></small>
				</h1>
			</div>
		</div>
		<!-- /.row -->
		<!-- Portfolio Item Row -->
		<div class="row">
			<div class="col-md-4">
				<img class="img-responsive"
					src="${pageContext.request.contextPath}/images/slider3.jpg" alt="">
			</div>
			<div class="col-md-8">
				<h3>Product Description</h3>
				<p>${itemdes}</p>
				<h4>
					<b>Price: $${itemprice} </b>
				</h4>
				<h3>Purchase this prodcut</h3>
				<br />

				<form action="HelloForm" method="POST" class="form-horizontal">
					<div class="col-sm-6 col-xs-12 text_field">
						<input type="text" class="form-control" name="fName" placeholder="Your Name"> <br />
					</div>
					<div class="col-sm-6 col-xs-12 text_field">
						<input type="text" class="form-control" name="phnNum" placeholder="Phone Number" />
					</div>
					<div class="col-sm-6 col-xs-12 btn_field">
						<input type="submit" class="btn btn-primary" value="CONFIRM">
					</div>
				</form>

			</div>
		</div>

		<!-- /.row -->
		<!-- Related Products Row -->
		<div class="row">
			<div class="col-lg-12">
				<h3 class="page-header">Related Products</h3>
			</div>
			<div class="col-sm-3 col-xs-6">
				<a href="#"> <img class="img-responsive portfolio-item"
					src="${pageContext.request.contextPath}/images/p.jpg" alt="">
				</a>
			</div>
			<div class="col-sm-3 col-xs-6">
				<a href="#"> <img class="img-responsive portfolio-item"
					src="${pageContext.request.contextPath}/images/p93.jpg" alt="">
				</a>
			</div>
			<div class="col-sm-3 col-xs-6">
				<a href="#"> <img class="img-responsive portfolio-item"
					src="${pageContext.request.contextPath}/images/tv2.jpg" alt="">
				</a>
			</div>
			<div class="col-sm-3 col-xs-6">
				<a href="#"> <img class="img-responsive portfolio-item"
					src="${pageContext.request.contextPath}/images/lens1.jpg" alt="">
				</a>
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
					<p>Copyright &copy; 2016 Web Service - Shopping Cart - Faculty
						Of Information Technology</p>
				</div>
			</div>
		</footer>
	</div>
	<!-- /.container -->
	<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</body>
</html>