<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Inventory</title>
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
<h1 class="display-4 font-weight-normal">Claim Inventory</h1>

<br>
<form action="SearchInventoryServlet" method="get">
  <div class="row">
    <div class="col">
      <p class="text-center">Toyota</p>
    </div>
    <div class="col">
      <select id="model" class="form-control" name="model">
        <option selected >Model</option>
        <option value="Camry">Camry</option>
        <option value="Corolla">Corolla</option>
      </select>
    </div>
  </div>
 <br>
  <div class="row">
    <div class="col">
      <select id="color" class="form-control" name="color">
        <option selected >Color</option>
        <option value="Blue">Blue</option>
        <option value="Gray">Gray</option>
        <option value="White">White</option>
        <option value="Black">Black</option>
      </select>
    </div>
    <div class="col">
      <input type="text" id="miles" class="form-control" placeholder="Miles" name="miles">
    </div>
  </div>
<br>
  <div class="row">
    <div class="col">
      <input type="text" id="priceMin" class="form-control" placeholder="Min Price" name="priceMin">
    </div>
    <div class="col">
     <input type="text" id="priceMax" class="form-control" placeholder="Max Price" name="priceMax">
    </div>
  </div>
<br>
  <div class="row">
    <div class="col">
      <input type="text" id="vId" class="form-control" placeholder="Vehicle ID" name="vId">
    </div>
    <div class="col">
     <button type="submit" class="btn btn-primary">Search</button>
    </div>
  </div>
</form>
<br>
<div class="table-responsive">

<c:if test="${cars != null}">
<table class="table">
  <thead>
	    <tr>
	      <th scope="col">Make</th>
	      <th scope="col">Model</th>
	      <th scope="col">Miles</th>
	      <th scope="col">Price</th>
	      <th scope="col">Year</th>
	      <th scope="col">Bought</th>
	      <th scope="col">Color</th>
	      <th scope="col">Type</th>
	      <th scope="col">Vehicle Id</th>
	    </tr>
  </thead>
  <tbody>
 <c:forEach var="cars" items="${cars}" varStatus="loop">  
  	<tr>
		    <td><c:out value="${cars.make}"/></td>
		    <td><c:out value="${cars.model}"/></td>
		    <td><c:out value="${cars.miles}"/></td>
		    <td><c:out value="${cars.price}"/></td>
		    <td><c:out value="${cars.year}"/></td>
		    <td><c:out value="${cars.bought}"/></td>
		    <td><c:out value="${cars.color}"/></td>
		    <td><c:out value="${cars.carType}"/></td>
		    <c:if test="${cars.bought = true}">
		    	<td><form action="ViewDetailsServlet" method="get">
		    		<input type="hidden" name="Id" value="${cars.vId}"/>
   						<button type="submit">View More</button>
		    	</form></td>
		    </c:if>
  	</tr>	 
</c:forEach>
  </tbody>
</table>
</c:if>


</div>
</body>
</html>