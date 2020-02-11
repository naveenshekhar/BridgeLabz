package com.bridgelabz.loginreg.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String a = request.getParameter("email");
		String b = request.getParameter("password");
		String c = request.getParameter("repet password");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonu", "naveen", "admin");
			PreparedStatement pstmt = con
					.prepareStatement("insert into registration(email,password,confirmpassword) values(?,?,?");
			pstmt.setString(1, a);
			pstmt.setString(1, b);
			pstmt.setString(1, c);
			con.close();
			int i = pstmt.executeUpdate();
			if (i > 0) {
				response.sendRedirect("success.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
