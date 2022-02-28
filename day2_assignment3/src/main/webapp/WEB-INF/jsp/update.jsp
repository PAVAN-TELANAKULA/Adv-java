<%@page isELIgnored="false" %>

<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Update Employee</title>
  </head>
  <body>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

    <div class="container mt-5">

    <h2 class="center">Update Employee Details</h2><br>

    <form action="${pageContext.request.contextPath}/formprocess" method="post">

     <div class="form-group">
               <label for="id">Id</label>
               <input type="number" class="form-control" name="id" id="id" aria-describedby="id" placeholder="Enter Id"
               value="${employee.id}">
           </div>

      <div class="form-group">
        <label for="name">Employee Name</label>
        <input type="text" class="form-control" name="name" id="name" aria-describedby="name" placeholder="Enter Name"
        value="${employee.name}">
      </div>

      <div class="form-group">
        <label for="designation">Designation</label>
        <input type="text" class="form-control" name="designation" id="designation" placeholder="Designation"
        value="${employee.designation}">
      </div>

       <div class="form-group">
              <label for="city">City</label>
              <input type="text" class="form-control" name="city" id="city" placeholder="City" value="${employee.city}">
            </div>

       <div class="form-group">
               <label for="contact">Contact Number</label>
               <input type="number" class="form-control" name="contact" id="contact" placeholder="Contact Number"
               value="${employee.contact}">
             </div>

       <div class="form-group">
               <label for="salary">Salary</label>
               <input type="number" class="form-control" name="salary" id="salary" placeholder="Salary"
               value="${employee.salary}">
             </div>

      <button type="submit" class="btn btn-primary">Update</button>
    </form>

    </div>


  </body>
</html>