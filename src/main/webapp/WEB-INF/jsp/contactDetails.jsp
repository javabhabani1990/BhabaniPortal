<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>contactDetails</title>
</head>
<body>


	<h1>contactDetails</h1>

	<div class="topDiv">

		<c:forEach items="${contactsList}" var="contact">
			<div class="jobDetailsDiv">
				<table>
					<tr>
						<td><b>Name :</b></td>
						<td><c:out value="${contact.fullName }" /></td>
					</tr>
					<tr>
						<td><b>Organisation name :</b></td>
						<td><c:out value="${contact.organisationName }" /></td>
					</tr>
					<tr>
						<td><b>Current city :</b></td>
						<td><c:out value="${contact.currentCity }" /></td>
					</tr>
					<tr>
						<td><b>Current state :</b></td>
						<td><c:out value="${contact.currentState }" /></td>
					</tr>
					<tr>
						<td><b>Current country :</b></td>
						<td><c:out value="${contact.currentCountry }" /></td>
					</tr>
					<tr>
						<td><b>Phone number :</b></td>
						<td><c:out value="${contact.phoneNum }" /></td>
					</tr>
					<tr>
						<td><b>Email id :</b></td>
						<td><c:out value="${contact.emailId }" /></td>
					</tr>
					<tr>
						<td><b>Office email id :</b></td>
						<td><c:out value="${contact.officeEmailId }" /></td>
					</tr>
					<tr>
						<td><b>DOB :</b></td>
						<td><c:out value="${contact.dob }" /></td>
					</tr>
					<tr>
						<td><b>Gender :</b></td>
						<td><c:out value="${contact.gender }" /></td>
					</tr>
					<tr>
						<td><b>Concern type :</b></td>
						<td><c:out value="${contact.concernType }" /></td>
					</tr>
					<tr>
						<td><b>Concern details :</b></td>
						<td><c:out value="${contact.concernDetails }" /></td>
					</tr>
					</div>
				</table>

				<br> <br>
		</c:forEach>

	</div>

</body>
</html>