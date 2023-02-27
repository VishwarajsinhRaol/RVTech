<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Successful Message</title>
</head>
<body>
	<form action="home.jsp">
		<h3>
			<%=request.getParameter("msg")%>
			Successful
		</h3>

		<br /> <input type="submit" value="Return to Home page" />

	</form>
</body>
</html>