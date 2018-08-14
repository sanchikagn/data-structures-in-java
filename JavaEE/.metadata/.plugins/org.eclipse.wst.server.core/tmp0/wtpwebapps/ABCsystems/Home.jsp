<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
<style>
.container {
	padding: 80px 120px;
}

.cas {
	background: #000d1a;
	color: #bdbdbd;
}

.cas h3 {
	color: #5c8a8a;
}

.carousel-inner img {
	width: 100%; /* Set width to 100% */
	margin: auto;
}

.btn {
	background-color: #000d1a;
}

.navbar {
	background-color: #000d1a;
	border: 0;
	font-size: 11px;
	letter-spacing: 4px;
	opacity: 0.9;
}

.navbar li a, .navbar .navbar-brand {
	color: #d5d5d5;
}

.navbar-nav li a:hover {
	background-color: white;
}
</style>

</head>
<title>ABC</title>

<link rel="stylesheet" href="css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>

	<nav class="navbar navbar navbar-fixed-top" data-spy="scroll">
		<div class="container-fluid">

			<a class="navbar-brand" href="#">ABC</a>

			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#about">HOME</a></li>
					<li><a href="#services">SERVICES</a></li>
					<li><a href="#contact">CONTACT</a></li>

				</ul>
			</div>
		</div>
	</nav>


	<div id="myCarousel" class="carousel slide" data-ride="carousel">
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
		</ol>

		<div class="carousel-inner" role="listbox">
			<div class="item active">
				<img src="img/phone.jpg" alt="phone" width="1200" height="700">
				<div class="carousel-caption">
					<h3>Online-shopping</h3>
					<hr>
					<p>Do your shopping online!Find out various electronic
						components.Different technologies,prices,offers for all our
						customers.Let's learn more on Tronic Mart</p>
				</div>
			</div>

			<div class="item">
				<img src="img/Laptop.jpg" alt="Laptop" width="1200" height="700">
				<div class="carousel-caption">
					<h3>Delivery</h3>
					<hr>
					<p>We delivery to your doorstep</p>
				</div>
			</div>

			<div class="item">
				<img src="img/3.jpg" alt="Camera" width="1200" height="700">
				<div class="carousel-caption">
					<h3>Offers</h3>
					<hr>
					<p>We have marvellous offers for our customers</p>
				</div>
			</div>
		</div>

		<!-- Left and right controls -->
		<a class="left carousel-control" href="#myCarousel" data-slide="prev">
			<span class="glyphicon glyphicon-chevron-left"></span> <span
			class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#myCarousel"
			data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
	</div>

	<div class="container text-center" id="about">
		<h3>
			<b>ABC</b>
		</h3>
		<p>
			<b>Co-create products with our customers</b>
		</p>
		<p>
			<b>VALUE - DELIVERY - POWER - CARE</b>
		</p>
	</div>
	<div id="tour" class="cas">

		<div class="container" id="services">
			<div class="row text-center">
				<h3>Explore varieties of electronic appliances!!</h3>
				<div class="col-sm-4">
					<div class="thumbnail">
						<img src="img/Laptop.jpg" alt="Laptop" width="400" height="300">
						<p>
							<strong>Computers & Laptop</strong>
						</p>

						<a href="lap.jsp">
							<button class="btn">Find More</button>
						</a>
					</div>
				</div>
				<div class="col-sm-4">
					<div class="thumbnail">
						<img src="img/TV.jpg" alt="TV" width="400" height="300">
						<p>
							<strong>TV, Audio & Surveillance</strong>
						</p>

						<a href="tv.jsp"><button class="btn">Find More</button></a>
					</div>
				</div>
				<div class="col-sm-4">
					<div class="thumbnail">
						<img src="img/3.jpg" alt="Camera" width="400" height="300">
						<p>
							<strong>Cameras</strong>
						</p>

						<a href="cam.jsp"><button class="btn">Find More</button></a>
					</div>
				</div>
			</div>
			<div class="row text-center">
				<div class="col-sm-2"></div>
				<div class="col-sm-4">
					<div class="thumbnail">
						<img src="img/phone.jpg" alt="Phone" width="400" height="300">
						<p>
							<strong>Phones & Tablets</strong>
						</p>

						<a href="phone.jsp"><button class="btn">Find More</button></a>
					</div>
				</div>
				<div class="col-sm-4">
					<div class="thumbnail">
						<img src="img/Veh.jpg" alt="Vehicle" width="400" height="300">
						<p>
							<strong>Vehicle Electronics and GPS</strong>
						</p>

						<a href="vehicle.jsp"><button class="btn">Find More</button></a>
					</div>
				</div>
				<div class="col-sm-2"></div>
			</div>
		</div>
	</div>
	<div class="container" id="contact">
		<div class="row">
			<div class="col-sm-5">
				<h2>Contact us</h2>
				<p>
					<span class="glyphicon glyphicon-map-marker"></span> Colombo,
					SriLanka
				</p>
				<p>
					<span class="glyphicon glyphicon-phone"></span> +94-11-2341541
				</p>
				<p>
					<span class="glyphicon glyphicon-envelope"></span>
					abccompany@hotmail.com
				</p>
			</div>
			<div class="col-sm-7">
				<div class="row">
					<div class="col-sm-6 form-group">
						<input class="form-control" id="name" name="name"
							placeholder="Name" type="text" required>
					</div>
					<div class="col-sm-6 form-group">
						<input class="form-control" id="email" name="email"
							placeholder="Email" type="email" required>
					</div>
				</div>
				<textarea class="form-control" id="comments" name="comments"
					placeholder="Comment" rows="5"></textarea>
				<br>
				<div class="row">
					<div class="col-sm-12 form-group">
						<button class="btn btn-primary pull-right" type="submit">Send</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>