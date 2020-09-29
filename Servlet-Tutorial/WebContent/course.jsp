<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
	<!DOCTYPE html>
<html lang="en">
  <head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous"> (Copy from getbootstrap.com)
    <title>Courses</title>
 <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
   </script>
  <style type="text/css">
    .weekDays-selector input {
display: none!important;
}

.weekDays-selector input[type=checkbox] + label {
  display: inline-block;
  border-radius: 6px;
  background: #dddddd;
  height: 40px;
  width: 30px;
  margin-right: 3px;
  line-height: 40px;
  text-align: center;
  cursor: pointer;
}

.weekDays-selector input[type=checkbox]:checked + label {
  background: #2AD705;
  color: #ffffff;
}
  </style>
  </head>

  <body>

    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Project name</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#">Home</a></li>
            <li><a href="#about">About</a></li>
            <li><a href="#contact">Contact</a></li>
          </ul>
        </div> 
      </div>
    </nav>

    <div class="container">
    <div style="margin-top: 100px"> </div>
      <div style="width: 300px">

      <br><br>

<form action="SchedulerServlet" method="post"> 
<h3>Professor</h3>
       <select class="form-control" id="professor" name="Professor">
      <option value="John White">John White</option>
      <option value="Michael Brown">Michael Brown</option>
      <option value="Tina Doe">Tina Doe</option>
     <option value="Emily Winter">Emily Winter</option>
      <option value="Christine Summer">Christine Summer</option>
    </select>
 <br>
 <h3>Course</h3>
       <select class="form-control" id="course" name="Course">
      <option value="Java">Java Programming</option>
      <option value="C#">C# Language</option>
      <option value="C++">C++ Language</option>
     <option value="C">C Lanuguage</option>
      <option value="Ruby on Rails">Ruby on Rails</option>
      <option value="Php">Php</option>
      <option value="SQL">SQL</option>
      <option value="Javascript">Javascript</option>
    </select>
</div>
<br>
<h3>WeekDay</h3>
<div class="weekDays-selector">
  <input type="checkbox" name="weekday" value="MONDAY" id="weekday-mon" class="weekday" />
  <label for="weekday-mon">M</label>
  <input type="checkbox" name="weekday" value="TUESDAY" id="weekday-tue" class="weekday" />
  <label for="weekday-tue" >T</label>
  <input type="checkbox" name="weekday" value="WEDNESDAY" id="weekday-wed" class="weekday" />
  <label for="weekday-wed">W</label>
  <input type="checkbox" name="weekday" value="THURSDAY" id="weekday-thur" class="weekday" />
  <label for="weekday-thu">T</label>
  <input type="checkbox" name="weekday" value="FRIDAY" id="weekday-fri" class="weekday" />
  <label for="weekday-fri">F</label>
</div>
<br>
 	<p>Room: <input type="text" id="roomnumber" name="Room"></p>
    <p>Date: <input type="date" id="datepicker" name="Start Date"></p>
    <p>Time: <input type="time" id="timepicker" name="Start Time"></p>
    <button type="submit">add course</button>
</form>
<br>
<div class="table-responsive">

<form action="SchedulerServlet" method="post">
<c:if test="${courses != null}">
<table class="table">
  <caption>Classes</caption>
  <thead>
    <tr>
      <th scope="col">Course</th>
      <th scope="col">Professor</th>
      <th scope="col">Days</th>
      <th scope="col">Time</th>
      <th scope="col">Room</th>
      <th scope="col">Start Date</th>
    </tr>
  </thead>
  <tbody>
 <c:forEach var="course" items="${courses}">  
  <tr>
    <td><c:out value="${course.courseName}"/></td>
    <td><c:out value="${course.professor}"/></td>
    <td><c:out value="${course.occurrences}"/></td>
    <td><c:out value="${course.time}"/></td>
    <td><c:out value="${course.room}"/></td>
    <td><c:out value="${course.date}"/></td>
    <td><button type="drop">drop course</button></td>
  </tr>	 
</c:forEach>
  </tbody>
</table>
</c:if>
</form>

</div>


</div>
</div> 
     
  </body>
</html>
