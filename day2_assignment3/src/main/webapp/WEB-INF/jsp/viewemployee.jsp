<%@page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Employee List</title>
  </head>
  <body>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

    <div class="container mt-5">

    <h2 class="center"  style="text-align:center; color:teal;">Employee List</h2><br>

   <table class="table table-striped " >
     <thead class="thead-dark" style="left: 50%;">
       <tr>
         <th scope="col">Id</th>
         <th scope="col">Name</th>
         <th scope="col">Designation</th>
         <th scope="col">City</th>
         <th scope="col">Contact</th>
         <th scope="col">Salary</th>
          <th scope="col"></th>
          <th scope="col"></th>
       </tr>
     </thead>

     <tbody style=" left: 50%;">
        <c:forEach var="emp" items="${employee}">
          <tr>
          <th scope="row">${emp.id}</th>
          <td>${emp.name}</td>
          <td>${emp.designation}</td>
          <td>${emp.city}</td>
          <td>${emp.contact}</td>
          <td>${emp.salary}</td>

          <td><a href="update/${emp.id}">Edit</a></td>
          <td><a href="deleteemp/${emp.id}">Delete</a></td>
          </tr>
          </c:forEach>
     </tbody>
   </table>

   <br>
  <button type="button" style="margin-left:42%" class="btn btn-primary btn-lg"><a href="signup" style="color:white;text-decoration:none">Add Employee</a></button>

    </div>


  </body>
</html>
