<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div
		style="padding: 200px; background: radial-gradient(#ABABAB, #787E88); vertical-align: middle;">
		<h2 style="color: #0083B3; text-align: center;">
			Successfully Login..<br>You are most Welcome to Modi Family !!!!<br>
		</h2>
		<jsp:useBean id="user" class="dto.UserDetails" scope="request">
			<jsp:setProperty property="fullName" name="user" value = "Alpa Modi"/>
			<jsp:setProperty property="gender" name="user" value = "Female"/>
			<jsp:setProperty property="city" name="user" value = "Ahmedabad"/>
		</jsp:useBean>
		
		<h3 style="color: #0083B3; text-align: center;">
			Full name :
			<jsp:getProperty property="fullName" name="user"/><br> Gender :
			<jsp:getProperty property="gender" name="user"/><br> City :
			<jsp:getProperty property="city" name="user"/>

		</h3>
	</div>
</body>
</html>