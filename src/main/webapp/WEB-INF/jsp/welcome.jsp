<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
/* table, th, td {
    border: 20px;
} */
#table1{
	position: absolute;
    width: 40%;
    top: 160px;
    left: 80px;
}

#divParagraphDetails{
	position: absolute;
	top: 220px;
	left: 450px;
	background-color: powderblue;
	height: 280px;
	width: 800px;
}

#divProfilePic{
	position: absolute;
	top: 210px;
	left: 80px;
	border-radius: 50%;
	background-image: url("images/b.jpg");
	height: 280px;
	width: 280px;
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
				<td>
					<a href="getBlogPage" style="text-decoration:none">Blog</a>
				</td>
				<td>
					<b>|</b>
				</td>
				<td>
					<a href="getContactMePage" style="text-decoration:none">Contactme</a>
				</td>
				<td>
					<b>|</b>
				</td>
				<td>
					<a href="getFeaturedByPage" style="text-decoration:none">Featuredby</a>
				</td>
				<td>
					<b>|</b>
				</td>
				<td>
					<a href="aboutMeDetailsPage" style="text-decoration:none">Aboutme</a>
				</td>
				<td>
					<b>|</b>
				</td>
				<td>
					<a href="getSignInPage" style="text-decoration:none">Signin</a>
				</td>
			</tr>
		</table>
		
		<div id = "divProfilePic">
			<p>
				pic
				
			</p>
		</div>
		
		<div id = "divParagraphDetails">
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