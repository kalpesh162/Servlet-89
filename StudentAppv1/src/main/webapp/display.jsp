<%@ page import="com.model.Student"%>
<%@ page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Student Record</title>

<link rel="stylesheet" href="./css/table.css">

</head>
<body>

	<%
List<Student> list =
(List<Student>) request.getAttribute("data");
%>

	<table>
		<tr>
			<th>ID</th>
			
			<th><a href="read?sort=name">NAME</a></th>

			<th><a href="read?sort=marks">MARKS</a></th>
			
			<th>UPDATE</th>
			<th>DELETE</th>
		</tr>


		<%
for (Student student : list) {
%>

		<tr>

			<td><%= student.getId() %></td>

			<td><%= student.getName() %></td>

			<td><%= student.getMarks() %></td>

			<td><a class="update"
				href="updateform?id=<%= student.getId() %>"> UPDATE </a></td>

			<td><a class="delete" href="delete?id=<%= student.getId() %>">
					DELETE </a></td>

		</tr>


		<%
}
%>

	</table>
</body>
</html>