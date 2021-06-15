<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Online Doctor Appointment</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"/>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
	<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body id="page-top" data-spy="scroll" data-target=".navbar-custom">
	<div id="wrapper">
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  			<a class="navbar-brand" href="index.jsp"><span class="colorchange">Online Doctor Appointment</span></a>
  				<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    				<span class="navbar-toggler-icon"></span>
  				</button>
  		<div class="collapse navbar-collapse justify-content-center" id="navbarSupportedContent">
    		<ul class="navbar-nav mr-auto">
      			<li class="nav-item active">
       				 <a class="nav-link" href="index.jsp">HOME <span class="sr-only">(current)</span></a>
      			</li>
      			<li class="nav-item">
        			<a class="nav-link" href="ViewDoctors.jsp">DOCTORS</a>
      			</li>
      			<li class="nav-item dropdown">
       			 <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
         			 SIGN UP
        		</a>
        		<div class="dropdown-menu" aria-labelledby="navbarDropdown">
          			<a class="dropdown-item" href="PatientRegisterForm.jsp">PATIENT SIGN UP</a>
          			<a class="dropdown-item" href="DoctorForm.jsp">DOCTOR SIGN UP</a>
          
        		</div>
      			</li>
      			<li class="nav-item dropdown">
        			<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
         				 LOGIN
        			</a>
        		<div class="dropdown-menu" aria-labelledby="navbarDropdown">
          			<a class="dropdown-item" href="PatientLoginForm.jsp">PATIENT LOGIN</a>
          			<a class="dropdown-item" href="DoctorLogin.jsp">DOCTOR LOGIN</a>
          			<a class="dropdown-item" href="AdminForm.jsp">ADMINISTRATOR LOGIN</a>
        		</div>
      			</li>
      		</ul>
 		</div>
	</nav>
	<section id="intro" class="intro">
		<div class="intro-content">
			<div class="container">
				<div class="row">
					<div class="col-lg-6">
						<div>
							<img src="Images/img3.jpg" class="img-responsive" alt="" style="height: 695px;"/>
						</div>
					</div>
					<div class="col-lg-6">
					<div class="panel-body">
						<h5 style="text-align: center;">Patient Registration Form</h5><hr>
						
					<form action="patientRegister" method="post" role="form" class="contactForm lead">
						<div class="row">
							<div class="col-xs-6 col-sm-6 col-md-6">
								<div class="form-group">
									<label>Patient ID</label>
									<input type="text"  name="pid" id="first_name" class="form-control input-md" title="Patient ID" value="" disabled>
									<div class="validation"></div>								
								</div>
							</div>
							<div class="col-xs-6 col-sm-6 col-md-6">
								<div class="form-group">
									<label>Patient Name</label>
									<input type="text"  name="pName" id="last_name" class="form-control input-md"  title="Patient Name could not be blank and should not contain digit" required>
									<div class="validation"></div>								
								</div>
							</div>
							<div class="col-xs-6 col-sm-6 col-md-6">
								<div class="form-group">
									<label>Email</label>
									<input type="email" name="pEmail"  placeholder="me@example.com" id="last_name" class="form-control input-md" title="Email cannot be blank and should contain @ character" required>
									<div class="validation"></div>								
								</div>
							</div>
							<div class="col-xs-6 col-sm-6 col-md-6">
								<div class="form-group">
									<label>Password</label>
									<input type="password" name="pPassword" id="last_name" class="form-control input-md " title="Maximum length should be 8 char" required>
									<div class="validation"></div>								
								</div>
							</div>
							<div class="col-xs-6 col-sm-6 col-md-6">
								<div class="form-group">
									<label>Contact No.</label>
									<input type="number" name="pContact"  id="first_name" class="form-control input-md" title="Phone number should not contain any alphabet" required>
									<div class="validation"></div>								
								</div>
							</div>
							<div class="col-xs-6 col-sm-6 col-md-6">
								<div class="form-group">
									<label>Patient Gender</label>
									<select name="gender" class="form-control" required>
										<option selected="" value="-1" disabled="">Select Gender</option>
										<option>Male</option>
										<option>Female</option>
										<option>Other</option>
									</select>
									<div class="validation"></div>								
								</div>
							</div>
							<div class="col-xs-6 col-sm-6 col-md-6">
								<div class="form-group">
									<label>Patient Age</label>
									<input type="number" name="pAge"  id="last_name" class="form-control input-md" title="Age should not contain any alphabet" required>
									<div class="validation"></div>								
								</div>
							</div>
							<div class="col-xs-6 col-sm-6 col-md-6">
								<div class="form-group">
									<label>Address</label>
									<textarea rows="2" cols="20" name="pAddress" title="Enter your Address" required></textarea>
									<div class="validation"></div>								
								</div>
							</div>
							<div class="col-xs-6 col-sm-6 col-md-6">
								<div class="form-group">
									<label>Select Disease</label>
									<select name="pDisease" class="form-control" required>
										<option selected="" value="-1" disabled="">Select Disease</option>
										<option value="Normal Diseases">Normal Diseases</option>
										<option value="Cancer">Cancer</option>
										<option value="Celiac Disease">Celiac Disease</option>
										<option value="Heart Disease">Heart Disease</option>
										<option value="Crohn's & Colitis">Crohn's & Colitis</option>
										<option value="Infectious Diseases">Infectious Diseases</option>
										<option value="Liver Disease">Liver Disease</option>
										<option value="Big Diseasses">Big Diseases</option>
										<option value="Private Diseases">Private Diseases</option>
										<option value="ENT Diseases">ENT Diseases</option>
										<option value="Other Diseases">Other Diseases</option>
									</select>
									<div class="validation"></div>								
								</div>
							</div>
							<div class="col-xs-6 col-sm-6 col-md-6">
								<div class="form-group">
									<label>Select Room Type</label>
									<select name="roomType" class="form-control" required>
										<option selected="" value="-1" disabled="">Select Rooms</option>
										 <option value="deluxe">Deluxe</option>
										  <option value="preminumDeluxe">Premium Deluxe</option>
										  <option value="suite">Suite</option>
										  <option value="twinSharingRoom">Twin Sharing Room</option>
										<option value="notRequired">Not Required</option>
									</select>
									<div class="validation"></div>								
								</div>
							</div>
						</div>
						<input type="submit" value="SUBMIT" class="btn btn-skin btn-lg btn-block">
					</form>
					<h5 style="text-align:center;"><a href="PatientLoginForm.jsp" >LOGIN HERE!!</a></h5>
					</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	</div>
</body>
</html>