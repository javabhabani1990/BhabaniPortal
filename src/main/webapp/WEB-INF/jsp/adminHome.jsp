<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<title>adminHome</title>

<style>
.modal-dialog {
	width: 500px;
	margin-top: 2.5cm;
}
</style>

</head>
<body>
	<h1>Admin Home</h1>

	<button type="button" class="btn btn-link" data-toggle="modal"
		data-target="#infoModal">Info</button>

	<br>
	<br>

	<a href="getContactDetailsPage">Contactdetails</a>

	<br>
	<br>

	<a href="aboutMeDetailsPage">Viewmyinfo</a>


	<!-- infoModal *********************************-->
	<div class="modal fade" id="infoModal" role="dialog">
		<div class="modal-dialog">

			<!-- Modal content -->
			<div class="modal-content">
				<div class="modal-header" style="background-color: #FF9933">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Info</h4>
				</div>
				<div class="modal-body">

					<form action="infoSectionForm" method="POST">
						<table>
							<tr>
								<td>Full name :</td>
								<td><input type="text" name="name" required /></td>
							</tr>
							<tr>
								<td>Father name :</td>
								<td><input type="text" name="fatherName" required /></td>
							</tr>
							<tr>
								<td>Mother name :</td>
								<td><input type="text" name="motherName" required /></td>
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
								<td>Alternative phone number :</td>
								<td><input type="text" name="altPhoneNum" required /></td>
							</tr>
							<tr>
								<td>Password :</td>
								<td><input type="text" name="password" required /></td>
							</tr>
							<tr>
								<td>Email id :</td>
								<td><input type="text" name="emailId" required /></td>
							</tr>
							<tr>
								<td>Alternative email id :</td>
								<td><input type="text" name="altEmailId" required /></td>
							</tr>
							<tr>
								<td>Highest qualification :</td>
								<td><input type="text" name="highestQulf" required /></td>
							</tr>
							<tr>
								<td>Created type :</td>
								<td><input type="text" name="createdType" required /></td>
							</tr>
							<tr>
								<td><input type="submit" value="Submit" /></td>
							</tr>
						</table>
					</form>

				</div>
				<div class="modal-footer" style="background-color: #128807">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				</div>
			</div>

		</div>
	</div>

</body>
</html>