package com.bridgelabz.loginreg.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.loginreg.service.UserService;
import com.bridgelabz.loginreg.serviceimplementation.UserServiceImpl;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	UserService uerserService = new UserServiceImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String password = request.getParameter("password");
		boolean result = uerserService.authentication(name, password);

		if (result) {
			HttpSession session = request.getSession();
			session.setAttribute(name, "name");
			session.setAttribute(password, "password");
			response.sendRedirect("welcome.jsp");
		} else {

			PrintWriter pw = response.getWriter();
			pw.print("Wrong userId Password");
			response.sendRedirect("login.jsp");

		}
	}

}
