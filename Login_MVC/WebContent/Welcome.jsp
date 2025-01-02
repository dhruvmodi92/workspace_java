<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"  import="dto.UserDetails"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
</head>
<body>
	<%
		UserDetails user = (UserDetails) session.getAttribute("user");
	%>
	<div
		style="padding: 200px; background: radial-gradient(#ABABAB, #787E88); vertical-align: middle;">
		<h2 style="color: #0083B3; text-align: center;">
			Successfully Login..<br>You are most Welcome to Modi Family !!!!<br>
		</h2>
		<h3 style="color: #0083B3; text-align: center;">
			Full name :
			<%=user.getFullName()%><br> Gender :
			<%=user.getGender()%><br> City :
			<%=user.getCity()%>

		</h3>
	</div>
</body>
</html>