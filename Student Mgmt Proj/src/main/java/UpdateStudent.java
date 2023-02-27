import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateDetails")
public class UpdateStudent extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			Class.forName(DBCon.driver);
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found " + e);
		}
		try {
			Connection conn = DriverManager.getConnection(DBCon.url);
			System.out.println("connection successful");
			PreparedStatement st = conn.prepareStatement("update student set name=?, email=?, contact=? where id=?");

			st.setString(1, request.getParameter("name"));
			st.setString(2, request.getParameter("email"));
			st.setString(3, request.getParameter("phnum"));
			st.setInt(4, Integer.valueOf(request.getParameter("id")));

			st.executeUpdate();

			st.close();
			conn.close();

			response.sendRedirect("success.jsp?msg=Update");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
