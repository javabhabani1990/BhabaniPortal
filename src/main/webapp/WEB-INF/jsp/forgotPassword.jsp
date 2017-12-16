<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>forgotPassword</title>
</head>
<body>
<h1>forgotPassword</h1>

	<form action="performForgotPassword" method="POST">
		<table>
			<tr>
				<td>Portal id :</td>
				<td><input type="text" name="portalId" required /></td>
			</tr>
			<tr>
				<td>New password :</td>
				<td><input type="text" name="password" required /></td>
			</tr>
			<tr>
				<td>Conform password :</td>
				<td><input type="password" name="cnfPassword" required /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form>

</body>
</html>