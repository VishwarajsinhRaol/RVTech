<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fetch Student</title>
</head>
<body>
	<form action="./FetchDetails" method="get">
		<table>
			<tr>
				<td>Enter ID:</td>
				<td><input type="text" name="id" maxlength="6" size="7" /></td>
			</tr>

		</table>
		<br /> <input type="submit" value="View Data" />
	</form>
	<br />
	<input type="button" value="Return to Home"
		onclick="window.location.href='home.jsp'" />

</body>
</html>