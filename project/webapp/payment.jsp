<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="com.userdao.Userdao"%>
<%@page import="com.userbean.Bookingbean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.userbean.Userbean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>KRRUNCHY</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="" />
<meta name="keywords" content="" />
<meta name="author" content="" />

<!-- Facebook and Twitter integration -->
<meta property="og:title" content="" />
<meta property="og:image" content="" />
<meta property="og:url" content="" />
<meta property="og:site_name" content="" />
<meta property="og:description" content="" />
<meta name="twitter:title" content="" />
<meta name="twitter:image" content="" />
<meta name="twitter:url" content="" />
<meta name="twitter:card" content="" />

<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
<link rel="shortcut icon" href="favicon.ico">

<link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i"
	rel="stylesheet">

<!-- Animate.css -->
<link rel="stylesheet" href="css/animate.css">
<!-- Icomoon Icon Fonts-->
<link rel="stylesheet" href="css/icomoon.css">
<!-- Bootstrap  -->
<link rel="stylesheet" href="css/bootstrap.css">
<!-- Owl Carousel -->
<link rel="stylesheet" href="css/owl.carousel.min.css">
<link rel="stylesheet" href="css/owl.theme.default.min.css">
<!-- Magnific Popup -->
<link rel="stylesheet" href="css/magnific-popup.css">
<!-- Flexslider  -->
<link rel="stylesheet" href="css/flexslider.css">
<!-- Flaticons  -->
<link rel="stylesheet" href="fonts/flaticon/font/flaticon.css">
<!-- Date Picker -->
<link rel="stylesheet" href="css/bootstrap-datepicker.css">

<link rel="stylesheet" href="css/style.css">


<!-- Modernizr JS -->
<script src="js/modernizr-2.6.2.min.js"></script>
<!-- FOR IE9 below -->
<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->
<script>
window.history.forward();
function noBack()
{
	window.history.forword();
}
</script>
</head>
<body  onLoad="noBack();" onpageshow="if(event.persisted) noBack();" onUnload="">
<%
	Userbean a=null;
		if(session.getAttribute("user")!=null)
		{
			a=(Userbean)session.getAttribute("user");
		 	int id=a.getId();	
	
%>
<%
List<Userbean> list = new ArrayList<>();
%>

	<nav id="colorlib-main-nav" role="navigation">
		<a href="#" class="js-colorlib-nav-toggle colorlib-nav-toggle active"><i></i></a>
		<div class="js-fullheight colorlib-table">
			<div class="colorlib-table-cell js-fullheight">
				<div class="row">
					<div class="col-md-6 col-md-offset-3">
						<div class="form-group">
							<input type="text" class="form-control" id="search"
								placeholder="Enter any key to search...">
							<button type="submit" class="btn btn-primary">
								<i class="icon-search3"></i>
							</button>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12 text-center">
						<ul>
							<li><a href="index.jsp">Home</a></li>
							<li><a href="login.jsp">Login/Register</a></li>
							<li><a href="menu.jsp">menus</a></li>
							<li><a href="speciality.jsp">specialties</a></li>
							<li><a href="reservation.jsp">Reservation</a></li>
							<!-- <li><a href="blog.jsp">Blog</a></li> -->
							<li><a href="about.jsp">About us</a></li>
							<li><a href="contact.jsp">Contact</a></li>
							<li class="active"><a href="payment.jsp">Payment</a></li>
							<li><a href="logout.jsp">logout</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</nav>

	<div id="colorlib-page">
		<header>
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="colorlib-navbar-brand">
							<a class="colorlib-logo" href="index.jsp"><i
								class="flaticon-cutlery"></i><span>KRRUNCHY</span></a>
						</div>
						<a href="#" class="js-colorlib-nav-toggle colorlib-nav-toggle"><i></i></a>
					</div>
				</div>
			</div>
		</header>
		<aside id="colorlib-hero">
			<div class="flexslider">
				<ul class="slides">
					<li style="background-image: url(images/img_bg_1.jpg);"
						data-stellar-background-ratio="0.5">
						<div class="overlay"></div>
						<div class="container-fluid">
							<div class="row">
								<div
									class="col-md-6 col-sm-12 col-xs-12 col-md-offset-3 slider-text">
									<div class="slider-text-inner text-center">
										<div class="desc">
											<span class="icon"><i class="flaticon-cutlery"></i></span>
											<h1>Payment</h1>
											<p>
												<span><a href="index.jsp">Home</a></span> <span>Payment</span>
											</p>
											<div class="desc2"></div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</li>
				</ul>
			</div>
		</aside>

		<div id="colorlib-contact">
			<div class="container">
				<div class="row">
					<div
						class="col-md-6 col-md-offset-3 text-center animate-box intro-heading">
						<h2>Payment</h2>
						<p>you don't think just pay and take your meal </p>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12 col-md-offset-0">
						<div class="row">
							<div class="col-md-4 animate-box">
								<h3>My Address</h3>
								<ul class="contact-info">
									<li><span><i class="icon-map5"></i></span>57,Qutbi Mohallah,1st Lane,Kalupur,Ahmedabad - 380001</li>
									<li><span><i class="icon-phone4"></i></span>+ 98240 21432</li>
									<li><span><i class="icon-envelope2"></i></span><a href="mailto:krrunchy3110@gmail.com">krrunchy3110@gmail.com</a></li>
									<li><span><i class="icon-globe3"></i></span><a href="mailto:symasvi@yahoo.com">symasvi@yahoo.com</a><br></li>
								</ul>
							</div>
							
							<form action="ActionController" method="post">
							
							 <div class="col-md-7 col-md-push-1 animate-box">
								<!--  <div class="row">
									<div class="col-md-12">
										<div class="form-group">
											<textarea name="" class="form-control" id="" cols="30"
												rows="7" placeholder="Message"></textarea>
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<input type="text" class="form-control" placeholder="Name">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<input type="text" class="form-control" placeholder="Email">
										</div>
									</div> -->
									<div>
										<h2><label>Pay 70/- for Book A Tiffin</lable></h2>
										<h3>सिर्फ 70 मे अपना भोजन प्राप्त करे</h3>
										<h5><label>Press Below Button Now for Pay With PAYTM</lable></h5>
										
									</div>
									<%
                                			Date d1= new Date();
                                			SimpleDateFormat ft = 
                                      		  new SimpleDateFormat ("yyyy.MM.dd");
                                        //out.print( "<h2 align=\"center\">" + ft.format(d1) + "</h2>");
                                		%>	
									<input type="hidden" name="txnAmount" value="70">
									<div class="col-md-12">
										<div class="form-group">
										<table><thead>
                                            <tr>
                                                <th>  User ID  </th>
                                                <th>Booking ID</th>
                                                <th>Date</th>
                                                <th>Quantity</th>
                                                <th>Price</th>
                                                <th>Status</th>
                                                <th>Payment</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        <%
                                    	List<Bookingbean> listB =Userdao.getallconfirmbooking(id,ft.format(d1));
                                    	
                                    %>
                                    
                                <%
                               
                                	for(Bookingbean b1: listB)
                                	{
                                %>
                                            <tr>
                                                <td><%= b1.getId() %></td>&nbsp;&nbsp;&nbsp;&nbsp;
                                                <td><%= b1.getBid() %></td>
                                                <td><%= b1.getDate() %></td>
                                                <td><%= "1" %></td>
                                                <td><%= b1.getPrice() %></td>
                                                <td><%= b1.getStatus() %></td>
                                                <td><%= b1.getPayment() %></td>
                                                <td><input type="hidden" name="bid" value="<%= b1.getBid() %>"></td>
												<td><a href="ActionController?action=cancelbooking&bid=<%= b1.getBid()%>">Cancel Tiffin</a></td>
												<td><input type="submit" name="action" value="Pay Now" class="btn btn-primary"></td>>
                                            </tr>
                                       <%
                                	}
                                       %>
                                         </tbody>
                                    </table>
										
											
										</div>
									</div>
								</div>
							</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div id="map" class="colorlib-map"></div>

		<footer>
			<div id="footer">
				<div class="container">
					<div class="row">
						<div class="col-md-3 col-pb-sm">
							<h2>Lutong Bahay</h2>
							<p>Even the all-powerful Pointing has no control about the
								blind texts it is an almost unorthographic life One day however
								a small line of blind.</p>
							<p class="colorlib-social-icons">
								<a href="#"><i class="icon-facebook4"></i></a> <a href="#"><i
									class="icon-twitter3"></i></a> <a href="#"><i
									class="icon-googleplus"></i></a> <a href="#"><i
									class="icon-dribbble2"></i></a>
							</p>
						</div>
						<div class="col-md-3 col-pb-sm">
							<h2>Latest Blog</h2>
							<div class="f-entry">
								<a href="#" class="featured-img"
									style="background-image: url(images/dish-5.jpg);"></a>
								<div class="desc">
									<span>May 5, 2018</span>
									<h3>
										<a href="#">How to cook beef Grilled with potato</a>
									</h3>
								</div>
							</div>
							<div class="f-entry">
								<a href="#" class="featured-img"
									style="background-image: url(images/dish-7.jpg);"></a>
								<div class="desc">
									<span>May 5, 2018</span>
									<h3>
										<a href="#">A Japanese Master Chef</a>
									</h3>
								</div>
							</div>
							<div class="f-entry">
								<a href="#" class="featured-img"
									style="background-image: url(images/dessert-3.jpg);"></a>
								<div class="desc">
									<span>May 5, 2018</span>
									<h3>
										<a href="#">Special Recipe for this month</a>
									</h3>
								</div>
							</div>
						</div>
						<div class="col-md-3 col-pb-sm">
							<h2>Instagram</h2>
							<div class="instagram">
								<a href="#" class="insta-img"
									style="background-image: url(images/dessert-1.jpg);"></a> <a
									href="#" class="insta-img"
									style="background-image: url(images/dessert-2.jpg);"></a> <a
									href="#" class="insta-img"
									style="background-image: url(images/dish-9.jpg);"></a> <a
									href="#" class="insta-img"
									style="background-image: url(images/dish-2.jpg);"></a>
							</div>
						</div>
						<div class="col-md-3 col-pb-sm">
							<h2>Newsletter</h2>
							<p>A small river named Duden flows by their place and
								supplies it with the necessary regelialia</p>
							<div class="subscribe text-center">
								<div class="form-group">
									<input type="text" class="form-control text-center"
										placeholder="Enter Email address"> <input
										type="submit" value="Subscribe"
										class="btn btn-primary btn-custom">
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12 text-center">
							<p>
								<span class="block">&copy; <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
									Copyright &copy;<script>
										document
												.write(new Date().getFullYear());
									</script> All rights reserved | This template is made with <i
									class="icon-heart" aria-hidden="true"></i> by <a
									href="https://colorlib.com" target="_blank">Colorlib</a> <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
									<br></span> <span class="block">Demo Images: <a
									href="http://unsplash.com/" target="_blank">Unsplash</a> &amp;
									<a href="https://www.pexels.com/" target="_blank">Pexel</a></span>
							</p>
						</div>
					</div>
				</div>
			</div>
		</footer>

	</div>

	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script src="js/jquery.waypoints.min.js"></script>
	<!-- Parallax -->
	<script src="js/jquery.stellar.min.js"></script>
	<!-- Owl Carousel -->
	<script src="js/owl.carousel.min.js"></script>
	<!-- Magnific Popup -->
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/magnific-popup-options.js"></script>
	<!-- Flexslider -->
	<script src="js/jquery.flexslider-min.js"></script>
	<!-- Date Picker -->
	<script src="js/bootstrap-datepicker.js"></script>
	<!-- Google Map -->
	<script
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCefOgb1ZWqYtj7raVSmN4PL2WkTrc-KyA&sensor=false"></script>
	<script src="js/google_map.js"></script>

	<!-- Main JS (Do not remove) -->
	<script src="js/main.js"></script>
<% 
		}
	else
		{
			response.sendRedirect("login.jsp");
		}
	
%>

</body>
</html>
