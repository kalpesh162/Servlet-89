<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	ArrayList<String> friends = new ArrayList<>();
	friends.add("Kareena");
	friends.add("Katreena");
	friends.add("Rareena");
	friends.add("Zareen");
	friends.add("Kangana");
	%>

	<h1>
		<%
	for (String name : friends) {
		out.print(name);  %>

     <br>
	 
    <%
	}
	%>
	</h1>




</body>
</html>