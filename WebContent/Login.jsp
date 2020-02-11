<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hello</title>
</head>
<body>

	<form name="loginForm" method="post" action="Login.jsp">
		<table width="20%" bgcolor="0099CC" align="center">

			<tr>
				<td colspan=2><center>
						<font size=4><b>Login Page</b></font>
					</center></td>
			</tr>

			<tr>
				<td>name:</td>
				<td><input type="text" size=25 name="name" required="required"></td>
			</tr>

			<tr>
				<td>Password:</td>
				<td><input type="Password" size=25 name="password"
					required="required"></td>
			</tr>
			<tr>
				<td><input type="Submit" name="login"></td>
			</tr>

			<tr>
				<td><input type="Reset"></td>
				<td><input type="submit" onclick="success.jsp" value="Login"></td>
				<td><a href="signup.jsp">Don't have Account</a></td>
			</tr>

		</table>
	</form>
	<!-- <script language="javascript">
		function check(form) {

			if (form.userid.value == "" && form.pwd.value == "Roseindia") {
				return true;
			} else {
				alert("Error Password or Username")
				return false;
			}
		}
	</script> -->

	<!-- <form action="action_page.php" method="post">
		<div class="imgcontainer">
			<img src="image.jpg" alt="Avatar" class="avatar">
		</div>

		<div class="container">
			<label for="uname"><b>Username</b></label> <input type="text"
				placeholder="Enter Username" name="uname" required> <label
				for="psw"><b>Password</b></label> <input type="password"
				placeholder="Enter Password" name="psw" required>

			<button type="submit">Login</button>
			<label> <input type="checkbox" checked="checked"
				name="remember"> Remember me
			</label>
		</div>

		<div class="container" style="background-color: #f1f1f1">
			<button type="button" class="cancelbtn">Cancel</button>
			<span class="psw">Forgot <a href="#">password?</a></span>
		</div>
		<div><br>
	<a href="signup.jsp">Don't have Account</a> </div>
	</form>
 -->


	<!-- <form action="Login" method="post"></form>
	Enter UserName :
	<input type="text" name="name">
	<br> Enter Password :
	<input type="text" name="password">
	<input type="Submit" name="log-in">
	<br>
	<a href="signup.jsp">Don't have Account</a> -->
</body>
</html>