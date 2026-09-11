<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1 style="font-size: x-large;">
<% String id=request.getParameter("id"); 
out.print(id);
%>
</h1>
<hr>
<h1 style="font-size: x-large; color: green;">
<% String name=request.getParameter("name"); 
out.print(name); %>
</h1>
<hr>
<h1 style="font-size: x-large; color: red;">
<% String marks=request.getParameter("marks"); 
out.print(marks);%>
</h1>



</body>
</html>