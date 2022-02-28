<%@page isELIgnored="false" %>

<html>
<head>
    <title>Profile</title>
</head>
<body>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Employees List</h1>
<table border="2" width="70%" cellpadding="2" style="border-collapse:collapse">
<tr><th>Id</th><th>Name</th><th>Designation</th><th>City</th><th>Contact</th><th>Salary</th><th>Edit</th><th>Delete</th><br><br></tr>
   <c:forEach var="emp" items="${employee}">
   <tr style="text-align:center">
   <td>${emp.id}</td>
   <td>${emp.name}</td>
   <td>${emp.designation}</td>
   <td>${emp.city}</td>
   <td>${emp.contact}</td>
   <td>${emp.salary}</td>

   <td><a href="editemp/${emp.id}" style="text-decoration:none">Edit</a></td>
   <td><a href="deleteemp/${emp.id}" style="text-decoration:none">Delete</a></td>
   </tr>
   </c:forEach>
   </table>
   <br>
   <button style="margin-left:20%"><a href="addemployee" style="text-decoration:none">add employee </a></button>

</body>
</html>
