<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login page</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous" />
	<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css"
	integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />

<style type="text/css">
.primary-color {
	background-color: navy;
}

.cont {
	background-color: #ff9e80;
	width: 194.5vh;
	height: 90vh;
}

.contain {
	background: #d1c4e9;
	width: 70vh;
	height: 70vh;
	margin-left: 350px;
	border-radius: 8px;
	text-align: center;
	padding: 40px;
	color: #1a237e;
}

input
{
  text-align: center;
  margin: auto;
  width: 55vh;
  
}

.btn1
{
  width: 80px;
}
.btn2
{
  width: 80px;
}
.faillog
{
  background-color: red;
}

</style>

</head>

<body>

	<div class="container">
		<%@ include file="navbar.jsp"%>

		<div class="cont">
			<br>
			<div class="contain">

				<form action="login_servlet" method="post">
				<% 				response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
                 %>
				    <h3>Login</h3>
				    <br>
					<label for="email"><h6>	Enter Email Or Phone<h6></label> 
					<input type="text" name="user_email" placeholder="enter email or phone" required="required">
					<br>
					<br>
			        <label for="password"><h6>	Enter Password<h6></label> 
					<input type="password" name="user_password" placeholder="enter password" required="required">
					<br>
		            <br>
		            <input type="submit" value="Submit" class="btn1">
		            <input type="reset" value="Reset" class="btn2"> 
		            <br>
		            <br>
					<a href="forgate_pass.jsp"> Forget Password</a>
					
				</form>
				<br>
				<br>
				<span class="faillog">
				<%
				  String logfail=(String)request.getAttribute("faillogin");
			       if(logfail!=null)
			       {
			    	   out.println(logfail);
			       }
				%>
				</span>
			</div>

		</div>

	</div>

</body>
</html>