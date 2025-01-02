<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<style>
#login_header{
	
	background:radial-gradient(#ABABAB,#787E88);
	padding: 20px;
	margin : 0px;
	border : 0px;
	text-align: center;
}

#login_table{
	
	
	background:radial-gradient(#ABABAB,#787E88);
	
	padding :160px;
	margin : 0px;
	border : 0px;
	
	
} 
#login_footer
{
	background-color: black;
	padding: 10px;
	margin : 0px;
	border : 0px;
	text-align: center;
	color:yellow;
}
</style>
</head>
<body>
	<div id="login_header">
		<h3 style="color: red">
			Welcome to MODI HOUSE....<br> Please Login for Further
			Processing
		</h3>
	</div>
	<div id="login_table">
		<form method="post" action="login">
			<table align="center" style="background-color: #0083B3;padding :40px;border-radius:10px;font-family: calibri;">
				<tr>
					<th>User Name :</th>
					<td><input type ="text" name="userName" /></td>
				</tr>
				<tr>
				<th>Password : </th>
				<td><input type ="password" name ="password"/></td>
				</tr>
				<tr>
				<td style ="colspan:2"><input type="submit" value ="Login">
				</td>
				</tr>
			</table>
		</form>
	</div>
	<div id ="login_footer">
	
	Copyrights@dhruvmodi.com
	
	</div>
</body>
</html>