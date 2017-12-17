<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>aboutMe</title>
</head>
<body>

	<h1>aboutMe</h1>

	<div class="topDiv">

		<c:forEach items="${aboutMeDetailsList}" var="aboutMeDetails">
			<div class="DetailsDiv">
				<table>
					<tr>
						<td><b>Name :</b></td>
						<td><c:out value="${aboutMeDetails.name }" /></td>
					</tr>
					<tr>
						<td><b>Father name :</b></td>
						<td><c:out value="${aboutMeDetails.fatherName }" /></td>
					</tr>
					<tr>
						<td><b>Mother name :</b></td>
						<td><c:out value="${aboutMeDetails.motherName }" /></td>
					</tr>
					<tr>
						<td><b>Gender :</b></td>
						<td><c:out value="${aboutMeDetails.gender }" /></td>
					</tr>
					<tr>
						<td><b>Marital status :</b></td>
						<td><c:out value="${aboutMeDetails.maritalStatus }" /></td>
					</tr>
					<tr>
						<td><b>Phone num :</b></td>
						<td><c:out value="${aboutMeDetails.phoneNum }" /></td>
					</tr>
					<tr>
						<td><b>Alt phone num :</b></td>
						<td><c:out value="${aboutMeDetails.altPhoneNum }" /></td>
					</tr>
					<tr>
						<td><b>Email id :</b></td>
						<td><c:out value="${aboutMeDetails.emailId }" /></td>
					</tr>
					<tr>
						<td><b>Alt email id :</b></td>
						<td><c:out value="${aboutMeDetails.altEmailId }" /></td>
					</tr>
					<tr>
						<td><b>Highest qulf :</b></td>
						<td><c:out value="${aboutMeDetails.highestQulf }" /></td>
					</tr>
					</div>
				</table>

				<br> <br>
		</c:forEach>
		
		<table>
			<tr>
				<td><a href="download{1}">Resume</a></td>
			</tr>
			<tr>
				<td><a href="download{2}">Biography</a></td>
			</tr>
			<tr>
				<td><a href="download{3}">Photo</a></td>
			</tr>
		</table>

	</div>

</body>
</html>