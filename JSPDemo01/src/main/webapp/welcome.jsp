<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- Directive Tag -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!--   Declaration Tag -->
<%! 
   int num=11;

  void f1(){
	  
  }
%>
<h1>

<!-- Expression Tag -->
<%= "Hello JSP" %>
</h1>

<!-- ScriptLet tag -->
<br>
<h2>

<%

 Date date=new Date();

 out.print(date);

%>

</h2>

</body>
</html>