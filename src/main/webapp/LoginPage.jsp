<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link href="CSS/style.css" rel="stylesheet" type="text/css">
</head>

<body>
	<div>
		<form action="LoginController" method="post">
			<div>
				Enter username :<input type="text" name="username"> <br>
				Enter password :<input type="password" name="password"><br>
				<input type="submit" value="Login">
				<td><a href="Registration.jsp">Registration</a></td>
			</div>

		</form>
	</div>
</body>
</html>