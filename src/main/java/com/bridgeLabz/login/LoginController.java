package com.bridgeLabz.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginControlle
 */
@SuppressWarnings("serial")
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
//	private static final long serialVersionUID = 1L;     
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public LoginController() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonu", "naveen", "admin");
			
			PreparedStatement ps=c.prepareStatement("select * from user where username = ? and password = ? ");
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				response.sendRedirect("Sucess.jsp");
				return;
			}
			response.sendRedirect("Error.jsp");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		doGet(request, response);
	}

}
