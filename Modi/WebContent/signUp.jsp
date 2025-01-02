<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="signUp">
		User Name : <input name="userName" /><br> Password : <input
			type="password" name="password" /><br> Full Name : <input
			name="fullName" /><br> Gender : <input type="radio"
			name="gender" value="Male" /> Male <input type="radio" name="gender"
			value="Female" /> Female<br> Location : <select name="location">
			<option value="Ahmedabad">Ahmedabad</option>
			<option value="Pune">Pune</option>
			<option value="Banglore">Banglore</option>
			<option value="Baroda">Baroda</option>
			<option value="Mumbai">Mumbai</option>
			<option value="Nadiad">Nadiad</option>
		</select><br> <input type="submit" />
	</form>

</body>
</html>