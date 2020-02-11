package com.bridgelabz.loginreg.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepository {

	private static Connection dbConnection() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/sonu";
		String name = "naveen";
		String password = "admin";
		Class.forName("com.mysql.jdbc.driver");
		Connection con = DriverManager.getConnection(url, name, password);
		return con;
	}

	public static boolean authentication(String name, String password) {
		String query = "select * from emp where username=? and password=?";

		try (PreparedStatement pstmt = dbConnection().prepareStatement(query)) {
			pstmt.setString(1, name);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery("query");
			if (rs.next()) {
				return true;
			} else {
				return false;
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
