import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InsertDetails")
public class InsertStudent extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// JDBC Connection
		try {
			Class.forName(DBCon.driver);
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found " + e);
		}
		try {
			Connection conn = DriverManager.getConnection(DBCon.url);
			System.out.println("connection successful");

			// Query/statement to insert the values
			PreparedStatement st = conn.prepareStatement("insert into student values(?, ?, ?, ?)");

			// set values into the query
			st.setInt(1, Integer.valueOf(request.getParameter("id")));
			st.setString(2, request.getParameter("name"));
			st.setString(3, request.getParameter("email"));
			st.setString(4, request.getParameter("phnum"));

			// Execute the query
			st.executeUpdate();

			st.close();
			conn.close();

			// Redirect the response to success page
			response.sendRedirect("success.jsp?msg=Insert");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}