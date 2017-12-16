<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>signUpUser</title>
</head>
<body>
	
	<h1>signUpUser</h1>
	
	<form action="performSignUpUser" method="POST">
		<table>
			<tr>
				<td>Full name :</td>
				<td><input type="text" name="name" required /></td>
			</tr>
			<tr>
				<td>Date of birth :</td>
				<td><input type="text" name="dateOfBirth" required /></td>
			</tr>
			<tr>
				<td>Present add :</td>
				<td><input type="text" name="presentAdd" required /></td>
			</tr>
			<tr>
				<td>Permanent add :</td>
				<td><input type="text" name="permanentAdd" required /></td>
			</tr>
			<tr>
				<td>Gender :</td>
				<td><input type="text" name="gender" required /></td>
			</tr>
			<tr>
				<td>Marital status :</td>
				<td><input type="text" name="maritalStatus" required /></td>
			</tr>
			<tr>
				<td>Phone number :</td>
				<td><input type="text" name="phoneNum" required /></td>
			</tr>
			<tr>
				<td>Email id :</td>
				<td><input type="text" name="emailId" required /></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="text" name="password" required /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form>
	
</body>
</html>