<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>contactMe</title>
</head>
<body>

	<form action="contactMeForm" method="POST">
		<table>
			<tr>
				<td>Full name :</td>
				<td><input type="text" name="fullName" required /></td>
			</tr>
			<tr>
				<td>Organisation name :</td>
				<td><input type="text" name="organisationName" required /></td>
			</tr>
			<tr>
				<td>Current city :</td>
				<td><input type="text" name="currentCity" required /></td>
			</tr>
			<tr>
				<td>Current state :</td>
				<td><input type="text" name="currentState" required /></td>
			</tr>
			<tr>
				<td>Current country :</td>
				<td><input type="text" name="currentCountry" required /></td>
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
				<td>Office email id :</td>
				<td><input type="text" name="officeEmailId" required /></td>
			</tr>
			<tr>
				<td>Date Of Birth :</td>
				<td><input type="text" name="dob" required /></td>
			</tr>
			<tr>
				<td>Gender :</td>
				<td><input type="text" name="gender" required /></td>
			</tr>
			<tr>
				<td>Concern type :</td>
				<td><input type="text" name="concernType" required /></td>
			</tr>
			<tr>
				<td>Concern details :</td>
				<td><input type="text" name="concernDetails" required /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form>

</body>
</html>