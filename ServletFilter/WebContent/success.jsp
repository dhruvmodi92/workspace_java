<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String name = (String)session.getAttribute("name");
	String auth = (String)session.getAttribute("authentication");
	//out.println(auth);
	%>
	
	<% if(auth == "failed")
		{
		out.append("You are not authorised to access this page");
		}
		else
		{
			out.append("Welcome "+name+" to our website!!!");
		}%>
	
	
</body>
</html>