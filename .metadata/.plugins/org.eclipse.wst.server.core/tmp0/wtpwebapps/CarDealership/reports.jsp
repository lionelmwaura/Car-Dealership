<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Reports</title>
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
<h1 class="display-4 font-weight-normal">Claim Reports</h1>


<div class="table-responsive">

<c:if test="${customers != null}">
<table class="table">
  <thead>
	    <tr>
	      <th scope="col">First Name</th>
	      <th scope="col">Last Name</th>
	      <th scope="col">Email</th>
	      <th scope="col">Address</th>
	      <th scope="col">Vehicle Id</th>
	    </tr>
  </thead>
  <tbody>
 <c:forEach var="customers" items="${customers}" varStatus="loop">  
  	<tr>
		    <td><c:out value="${customers.firstName}"/></td>
		    <td><c:out value="${customers.lastName}"/></td>
		    <td><c:out value="${customers.email}"/></td>
		    <td><c:out value="${customers.address}"/></td>
		    <td><c:out value="${customers.vId}"/></td>
  	</tr>	 
</c:forEach>
  </tbody>
</table>
</c:if>


</div>
</body>
</html>