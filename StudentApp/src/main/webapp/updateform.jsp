<%@page import="com.model.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Update Form</title>
<link rel="stylesheet" href="./css/form.css"><link>
</head>
<body>

	<%  Student student =(Student)request.getAttribute("student"); %>

	<h2>Update Student</h2>

	<%
		if (student != null) {
	%>

	<form action="update" method="get">

		<label>ID:</label> <input type="text" name="id"  value="<%= student.getId() %>" readonly> <br>
		
		<br> <label>Name:</label> <input type="text" name="name" value="<%= student.getName() %>"> <br>
		
		<br> <label>Marks:</label> <input type="text" name="marks" value="<%= student.getMarks() %>"> <br>
		
		<br> <input type="submit" value="UPDATE">

	</form>

	<%
		} else {
	%>

	<h3>Student not found!</h3>

	<%
		}
	%>



</body>
</html>