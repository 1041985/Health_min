<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

start.jsp<br>
	
	<% String viewMain = request.getContextPath()+"/main.main"; %>
	<% response.sendRedirect(viewMain); %>


</body>
</html>