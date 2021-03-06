<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.car.Toyota" %>
    
    <%
    	Toyota toyota = (Toyota) session.getAttribute("toyota"); 
    %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Lexus</title>
	<link rel="stylesheet" type="text/css" href="./styles/styles.css">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
		
    </style>
    <!-- Custom styles for this template -->
    <link href="carousel.css" rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
  		<a class="navbar-brand" href="#">Claim Dealer</a>
  		<a class="nav-link active" href="index.jsp">Home</a>
  		<a class="nav-link" href="toyota.jsp">Toyota</a>
  		<a class="nav-link" href="reports.jsp">Reports</a>
  		<a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true"></a>
	</nav>
	<div class="position-relative overflow-hidden p-3 p-md-5 m-md-3 text-center bg-light">
  <div class="col-md-5 p-lg-5 mx-auto my-5">
    <h1 class="display-4 font-weight-normal">Claim Toyota</h1>
    <p class="lead font-weight-normal">Welcome to Claim Toyota. We pride ourselves in our customer service and outstanding 1 star reviews. </p>
  	<a class="btn btn-outline-secondary" href="DisplayInventoryServlet">View Inventory</a>
  </div>
  <div class="product-device shadow-sm d-none d-md-block"></div>
  <div class="product-device product-device-2 shadow-sm d-none d-md-block"></div>
</div>

<div class="text-center">
      <h5>Features</h5>
      <ul class="list-unstyled text-small">
        <li><a class="text-muted" href="#">Cool stuff</a></li>
        <li><a class="text-muted" href="#">Random feature</a></li>
        <li><a class="text-muted" href="#">Team feature</a></li>
        <li><a class="text-muted" href="#">Stuff for developers</a></li>
        <li><a class="text-muted" href="#">Another one</a></li>
        <li><a class="text-muted" href="#">Last time</a></li>
      </ul>
</div>

</body>
</html>