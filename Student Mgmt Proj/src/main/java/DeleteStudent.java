import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteDetails")
public class DeleteStudent extends HttpServlet {
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
			PreparedStatement st = conn.prepareStatement("delete from student where id=?");

			st.setInt(1, Integer.valueOf(request.getParameter("id")));

			st.executeUpdate();

			st.close();
			conn.close();

			response.sendRedirect("success.jsp?msg=Delete");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
