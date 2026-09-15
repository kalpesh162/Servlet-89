<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
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

request.setAttribute("data",friends);


request.getRequestDispatcher("/two.jsp").forward(request, response);

%>



</body>
</html>