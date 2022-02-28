<%@page isELIgnored="false" %>

<html>
<head>
    <title>services</title>
</head>
<body>

<h1> Services </h1>
<h2>Hello, This is spring mvc project</h2>

<%
    String name= (String) request.getAttribute("name");
    String service= (String) request.getAttribute("service");
%>

<hr>


<h1>Services : <br><br>${name} <br> ${service}</h1>

</body>
</html>
