<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Student</title>
</head>
<body>
	<h2>Fill in your details</h2>

	<form action="./UpdateDetails" method="post">
		<table>
			<tr>
				<td>ID:</td>
				<td><input type="text" name="id"
					value="<%=request.getParameter("id")%>" readonly="readonly">
				</td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" maxlength="30" size="25" /></td>
			</tr>
			<tr>
				<td>Email Id:</td>
				<td><input type="text" name="email" maxlength="40" size="35" /></td>
			</tr>
			<tr>
				<td>Phone Number:</td>
				<td><input type="text" name="phnum" maxlength="10" size="11" /></td>
			</tr>
			<tr />
		</table>
		<br /> <input type="submit" value="Update Data" />
	</form>
	<br />
	<input type="button" value="Return to Home"
		onclick="window.location.href='home.jsp'" />
</body>
</html>