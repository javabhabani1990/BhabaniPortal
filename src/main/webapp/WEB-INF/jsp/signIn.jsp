<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>signin</title>
</head>
<body>

	<!-- Sign In Form -->
	<form action="baseSignIn" method="POST">
		<table>
			<tr>
				<td>Portal Id :</td>
				<td><input type="text" name="portalId" required /></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="password" required /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form>
	<a href="getForgotPasswordPageUser">Forgot password</a>
	<br>
	<a href="signUpUserPage">Sign up</a>

</body>
</html>