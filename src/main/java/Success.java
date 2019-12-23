
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Success
 */
@WebServlet("/Success")
public class Success extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Connection con = null;

		PrintWriter out = response.getWriter();

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String email = request.getParameter("email");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonu", "naveen", "admin");
			PreparedStatement ps = con
					.prepareStatement("insert into user(username,password,name,email) values (?,?,?,?)");

			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3, name);
			ps.setString(4, email);

			int i = ps.executeUpdate();
			String msg = " ";
			if (i != 0) {
				msg = "Record has been inserted";
				out.println("<font size='6' color=blue>" + msg + "</font>");
			} else {
				msg = "failed to insert the data";
				out.println("<font size='6' color=blue>" + msg + "</font>");
			}
			ps.close();
		} catch (Exception e) {
			out.println(e);
		}
	}

}
