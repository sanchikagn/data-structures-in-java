<%@ page language="java" contentType="text/html; charset=ISO-8859-1"     pageEncoding="ISO-8859-1" import="java.util.*" import="com.abcsystems.products.Product" %> 
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>ABC</title>
    <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="css/magnific-popup.css" type="text/css">
    <link rel="stylesheet" href="css/lap1.css" type="text/css">
</head>

<body id="page-top">

    <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand page-scroll" href="Home.jsp">ABC</a>
            </div>
			
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
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
<br/><br/><br/><br/>
    <header>
        <div class="header-content">
            <div class="header-content-inner" align="center">
                <h1>Phones & Tablets</h1>				
                <hr>             				
                <a href="#about" class="btn btn-primary btn-xl page-scroll">Find Out More</a>
            </div>
        </div>
    </header>
<br/><br/><br/><br/>
    <section class="bg-primary" id="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <h2 class="section-heading">What We've got!</h2>
                    <hr class="light">
                    <p class="text-faded">We have got many more offers and previlages for our customers<br>We serves technlogy on your hand!!</p>
                    <br/>
					<a href="#portfolio" class="page-scroll btn btn-default btn-xl sr-button">Get Started!</a>
               <br/><br/><br/>
			   </div>
            </div>
        </div>
    </section>
	<br/><br/><br/><br/><br/>

<div class="row">                                              

<% ArrayList<Product> productList = (ArrayList)request.getAttribute("products"); %>                            
<% for(int i=0; i<productList.size(); i++){                     
%>                         
<div class="col-sm-4 col-lg-4 col-md-4">                             
<div class="thumbnail">                                 

<img src="${pageContext.request.contextPath} /images/<%=productList.get(i).getImage() %>" alt="">                                 
<div class="caption">                                     
<h4 class="pull-right">$<%=productList.get(i).getPrice() %></h4>                                     
<h4><a href="#"><%=productList.get(i).getName() %></a>                                     
</h4>                                     
<p><%=productList.get(i).getDescription() %></p>                                 
</div>                                 
<div class="ratings">                                     
<a href="${pageContext.request.contextPath}/product.jsp" class="btn btn-primary">Order Now</a>                                 
</div>                             
</div>                         
</div>                     
<%}%>  
       </div>  

    <aside class="bg-dark">
        <div class="container text-center">
            <div class="call-to-action">
                
            </div>
        </div>
    </aside>

    <section id="contact">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <h2 class="section-heading">Get In Touch With Us!</h2>
                    <hr class="primary">
                    <p>Start Your transaction with us?<br> Great! Contact us via phone or mail us!</p>
                </div>
                <div class="col-lg-4 col-lg-offset-2 text-center">
                    <i class="fa fa-phone fa-3x sr-contact"></i>
                    <p>+94-11-2571871</p>
                </div>
                <div class="col-lg-4 text-center">
                    <i class="fa fa-envelope-o fa-3x sr-contact"></i>
                    <p><a href="#">abccompany@gmail.com</a></p>
                </div>
            </div>
        </div>
    </section>

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="js/scrollreveal.min.js"></script>
    <script src="js/jquery.easing.min.js"></script>
    <script src="js/jquery.fittext.js"></script>
    <script src="js/jquery.magnific-popup.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="js/creative.js"></script>

</body>

</html>
