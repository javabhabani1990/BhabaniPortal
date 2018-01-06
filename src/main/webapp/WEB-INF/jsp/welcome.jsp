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

<title>Insert title here</title>

<style>
/* table, th, td {
    border: 20px;
} */
#table1 {
	position: absolute;
	width: 40%;
	top: 160px;
	left: 80px;
}

#divParagraphDetails {
	position: absolute;
	top: 220px;
	left: 450px;
	background-color: powderblue;
	height: 280px;
	width: 800px;
}

#divProfilePic {
	position: absolute;
	top: 210px;
	left: 80px;
	border-radius: 50%;
	background-image: url("images/b.jpg");
	height: 280px;
	width: 280px;
}

.modal-dialog {
	width: 500px;
	margin-top: 2.5cm;
}

/* #devTable1{
	position: absolute;
	top: 100px;
	left: 40px;
} */
</style>

</head>
<body background="images/a.jpg">
	<h1>Welcome</h1>

	<table id="table1">
		<tr>
			<td><a href="getBlogPage" style="text-decoration: none">Blog</a>
			</td>
			<td><b>|</b></td>
			<td>
				<!-- <a href="getContactMePage" style="text-decoration:none">Contactme</a> -->
				<button type="button" class="btn btn-link" data-toggle="modal"
					data-target="#contactMeModal">Contactme</button>
			</td>
			<td><b>|</b></td>
			<td><a href="getFeaturedByPage" style="text-decoration: none">Portfolio</a>
			</td>
			<td><b>|</b></td>
			<td><a href="aboutMeDetailsPage" style="text-decoration: none">Aboutme</a>
			</td>
			<td><b>|</b></td>
			<td>
				<!-- <a href="getSignInPage" style="text-decoration: none">Signin</a> -->
				<button type="button" class="btn btn-link" data-toggle="modal"
					data-target="#signInMeModal">SignIn</button>
			</td>
		</tr>
	</table>

	<!-- contactMeModal *********************************-->
	<div class="modal fade" id="contactMeModal" role="dialog">
		<div class="modal-dialog">

			<!-- Modal content -->
			<div class="modal-content">
				<div class="modal-header" style="background-color: #FF9933">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Contact me</h4>
				</div>
				<div class="modal-body">
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
				</div>
				<div class="modal-footer" style="background-color: #128807">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				</div>
			</div>
		</div>
	</div>

	<!-- signInMeModal *********************************-->
	<div class="modal fade" id="signInMeModal" role="dialog">
		<div class="modal-dialog">

			<!-- Modal content -->
			<div class="modal-content">
				<div class="modal-header" style="background-color: #FF9933">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">signInMeModal</h4>
				</div>
				<div class="modal-body">

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
					
					<a href="getForgotPasswordPageUser">Forgot password</a> <br>
					<button type="button" class="btn btn-link" data-toggle="modal"
						data-target="#signUpMeModal">Sign up</button>
				</div>
				<div class="modal-footer" style="background-color: #128807">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				</div>
			</div>

		</div>
	</div>

	<!-- signUpMeModal *********************************-->
	<div class="modal fade" id="signUpMeModal" role="dialog">
		<div class="modal-dialog">

			<!-- Modal content -->
			<div class="modal-content">
				<div class="modal-header" style="background-color: #FF9933">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Sign up</h4>
				</div>
				<div class="modal-body">
					<p>Some text in the modal.</p>
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
				</div>
				<div class="modal-footer" style="background-color: #128807">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				</div>
			</div>
		</div>
	</div>
	
	<div id="divProfilePic">
		<p>pic</p>
	</div>

	<div id="divParagraphDetails">
		<pre>
<b>
	Born into an aristocratic Bengali family of Calcutta, Vivekananda was inclined towards spirituality.
He was influenced by his guru, Ramakrishna, from whom he learnt that all living beings were an embodiment 
of the divine self; therefore, service to God could be rendered by service to mankind. 

	After Ramakrishna's death, Vivekananda toured the Indian subcontinent extensively and acquired first-hand 
knowledge of the conditions prevailing in British India. He later travelled to the United States, representing 
India at the 1893 Parliament of the World's Religions.

	After Ramakrishna's death, Vivekananda toured the Indian subcontinent extensively and acquired first-hand 
knowledge of the conditions prevailing in British India. He later travelled to the United States, representing 
India at the 1893 Parliament of the World's Religions.
<b>

		
		
		
		
		</pre>
	</div>

	<!-- <pre>
	
		<a href="getBlogPage">Blog</a>
		
		<a href="getContactMePage">Contactme</a>
		
		<a href="getFeaturedByPage">Featuredby</a>
		
		<a href="aboutMeDetailsPage">Aboutme</a>
		
		<a href="getSignInPage">Signin</a>
	
	</pre> -->

</body>
</html>