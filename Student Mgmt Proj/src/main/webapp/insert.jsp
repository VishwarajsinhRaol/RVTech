<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Student</title>
</head>
<body>
	<h2>Fill in the details</h2>

	<form action="./InsertDetails" method="post">
		<table>
			<tr>
				<td>ID:</td>
				<td><input type="text" name="id" maxlength="6" size="7" /></td>
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
		<br /> <input type="submit" value="Insert Data" />

	</form>
	<br />
	<input type="button" value="Return to Home"
		onclick="window.location.href='home.jsp'" />
</body>
</html>