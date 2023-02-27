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

@WebServlet("/FetchDetails")
public class FetchStudent extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			Class.forName(DBCon.driver);
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found " + e);
		}
		try {

			int id = 0;
			String name = "", email = "", ph = "";

			Connection conn = DriverManager.getConnection(DBCon.url);
			System.out.println("connection successful");
			PreparedStatement st = conn.prepareStatement("select * from student where id=?");

			st.setInt(1, Integer.valueOf(request.getParameter("id")));

			ResultSet rs = st.executeQuery();

			while (rs.next()) {

				id = rs.getInt(1);
				name = rs.getString(2);
				email = rs.getString(3);
				ph = rs.getString(4);

			}

			rs.close();
			st.close();
			conn.close();

			response.sendRedirect("result.jsp?id=" + id + "&name=" + name + "&email=" + email + "&phone=" + ph);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}