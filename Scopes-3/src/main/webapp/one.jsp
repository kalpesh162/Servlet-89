<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% 

ArrayList<String>friends=new ArrayList<>();
friends.add("Tushar");
friends.add("Raju");
friends.add("Taboo");
friends.add("Ruthik");

application.setAttribute("data",friends);


%>

<hr>
<h1> <a href='two.jsp'> LINK</a> </h1>



</body>
</html>