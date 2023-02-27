<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>
<body>
	<h2 align="center">Welcome to Student database management system</h2>
	<br />
	<table style="align-items: center;">

		<tr>
			<td>To insert your details into the Database:</td>
			<td><input type="button" value="Insert data"
				onclick="window.location.href='insert.jsp'" /></td>
		</tr>
		<tr>
			<td>To delete your details from the Database:</td>
			<td><input type="button" value="Delete data"
				onclick="window.location.href='delete.jsp'" /></td>
		</tr>
		<tr>
			<td>To view your details from the Database:</td>
			<td><input type="button" value="Fetch data"
				onclick="window.location.href='fetch.jsp'" /></td>
		</tr>
	</table>
</body>
</html>