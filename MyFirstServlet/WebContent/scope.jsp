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
String userName = request.getParameter("name");
if(userName != null)
{
	session.setAttribute("sessionUserName",userName);
	application.setAttribute("applicationUserName", userName);
	pageContext.setAttribute("pageContextUserName", userName,PageContext.APPLICATION_SCOPE);
	//out.write("scope : "+pageContext.findAttribute("name"));
}
%>
<h1>MODI FAMILY WELCOMES YOU...KEEP SMILING</h1>
<br>
User Name using request parameter : <%=userName %>
<br>
User Name using session parameter : <%=session.getAttribute("sessionUserName") %>
<br>
User Name using application parameter : <%=application.getAttribute("applicationUserName") %>
<br>
User Name using pageContext parameter : <%= application.getAttribute("pageContextUserName")%>
<br>

</body>
</html>