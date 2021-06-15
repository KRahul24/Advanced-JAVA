<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Login Page</title>
</head>
<body>
	<h1>Patient Login Page</h1>
	<form action="patientLogin" method="post">
		<br>
		<%if(session.getAttribute("errorMessage")!=null) {%>
		<h5 style="color: red;"><%= session.getAttribute("errorMessage") %></h5>
		<%} %>
		<table>
			<tr>
				<td>Email :</td>
	 			<td><input type="text" name="pEmail"></td>
			</tr>
	
			<tr>
				<td> Password : </td>
				<td><input type="password" name="pPassword"></td>
			</tr> 
	
			<tr align="center" >
				<td colspan="2"><input type="submit" value="Login"></td>
			</tr>
		</table>

	</form>
</body>
</html>