<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MODI</title>
</head>
<body>

<h1>HI DHRUV MODI!!!</h1>
	<%!
	public int add(int a, int b){
		return a+b;
	}
	%>
	<br>
		<%
	int a =3;
	int b=4;
	out.println("The sum of a and b is "+(a+b));
	%>
	
	<% for(int i=0;i<5;i++)
	{%>
	<br>The value of i is : <%=i %>
	<%} %>
	<br>
	The sum of and b is using add function <%=add(56,89) %>
</body>
</html>