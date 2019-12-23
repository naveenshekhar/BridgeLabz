<%@page import="javax.swing.text.TabableView"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

<link href=”Bootstrap/css/bootstrap.min.css” rel=”stylesheet”
	type=”text/css” />
<script type=”text/javascript” src=”Bootstrap/js/bootstrap.min.js”></script>
<title>Bootstrap Project</title>
</head>
<body>
<div class="container">
	<form action="Successer" method="get">
		<div class="form-group">
			Successfully Logged in...!!
			<table class="table table-dark">
				<thead>
					<tr>
						<th scope="col">UserId</th>
						<th scope="col">UserName</th>
						<th scope="col">Password</th>
						<th scope="col">Name</th>
						<th scope="col">EmailId</th>
						<th scope="col">Update</th>
						<td><a href="update.jsp">Update</a></td>
					</tr>
				</thead>
				<%
				Connection con = null;
				ResultSet rs = null;
				PreparedStatement ps = null;

				try {
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonu", "naveen", "admin");
					ps = con.prepareStatement("select * from sonu.user");
					rs = ps.executeQuery();
					while (rs.next()) {
						
			%>
				
				<tbody>
					<tr>
						<td><%=rs.getInt("id")%></td>
						<td><%=rs.getString("username")%></td>
						<td><%=rs.getString("password") %></td>
						<td><%=rs.getString("name")%></td>
						<td><%=rs.getString("email")%></td>
						
					</tr>
				</tbody>
			
			<%
				}
			%>
			</table>
			<%
				} catch (Exception e) {
					System.out.println(e);
				} finally {
					con.close();
					rs.close();
					ps.close();
				}
			%>
		</div>
	</form>
	</div>
</body>
</html>