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
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); //HTTP 1.1
		response.setHeader("Pragme", "no-cache"); //HTPP 1.0
		response.setHeader("Expires", "0"); //Proxy Servers 
		if(session.getAttribute("username") == null){
			response.sendRedirect("login.jsp");
		}
	%>
	
	Welcome ${username} <br>
	
	<a href = "videos.jsp">Videos here</a>
	
	<form action = "Logout">
		<input type = "submit" value = "Log Out"> 
	</form>
</body>
</html>