<%@page isELIgnored="false" %>
<%@page import="java.util.List"%>

<html>
<head>
    <title>about</title>
</head>
<body>
<h1> About Us </h1>
<h2>Hello, This is spring mvc project</h2>

<%
    String name= (String) request.getAttribute("name");
    Integer id= (Integer) request.getAttribute("id");
    List<String> list= (List<String>) request.getAttribute("f");
%>

<hr>

<h1>Name : <%= name %></h1>
<h1>Id : ${id}</h1>

<%
    for(String s:list){
%>
     <h2> <%= s %> </h2>
<%
    }
%>


</body>
</html>
