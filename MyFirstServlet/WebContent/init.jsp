<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%=getServletConfig().getInitParameter("defaultUserName") %>
<br>
<%! 
public void jspInit()
{
String initParams = getServletConfig().getInitParameter("defaultUserName");
getServletContext().setAttribute("contextParams", initParams);
}
%>
User Name jspInit function : <%=getServletContext().getAttribute("contextParams") %>
</body>
</html>