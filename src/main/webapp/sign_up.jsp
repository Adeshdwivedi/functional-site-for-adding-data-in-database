<%@page import="com.cvweb.helper.password_validation"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign-Up page</title>

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

.form_page {
	background-color: #64b5f6;
	width: 194.4vh;
	height: 120vh;
}

.form1 {
	border-radius: 7px;
	margin-left: 275px;
	background-color: #ff8a80;
	width: 100vh;
	height: 105vh;
	text-align: center;
	padding: 40px;
	color: #1a237e;
}

input {
	text-align:center;
	width: 55vh;
	margin: auto;
}

.file1 {
	background-color: white;
}

.btn1 {
	width: 80px;
}

.btn2 {
	width: 80px;
}

.QnA {
	color: black;
}
.signupfailed
{
 background-color: red;
}
</style>

</head>
<body>
	<div class="container">

		<%@ include file="navbar.jsp"%>

		<div class="form_page">
			           
						  
			<div class="form1">
			
			        <br>
                     	<span class="signupfailed">
						  <%
						    String signup=(String)request.getAttribute("unsavedmsg");
						    if(signup!=null)
						    {
						    	out.println(signup);
						    }
						  
						  %>
						  </span>
						  <br>
				<form action="sign_up_servlet" method="post">
				<% 				response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
                 %>
					<h4>Sign-Up</h4>


					<table>
						<tr>
							<td><label for="first_name"><h6>
										Enter First Name
										
										<h6></label> <input type="text" name="user_first_name"
								    placeholder="enter first name"  value="<%
								    String fn=request.getParameter("user_first_name");
									if(fn!=null)
									{
										out.println(fn);
										out.println();
										
									}
								%>">
								</td>
							<td>
								<%
								String msg = (String) request.getAttribute("msg");
								if (msg != null) {
									out.print(msg);
								}
								%>
							</td>


						</tr>

						<tr>
							<td><label for="last_name"><h6>
										Enter Last Name
										<h6></label> <input type="text" name="user_last_name"
								placeholder="enter last name" value="<%
								    String ln=request.getParameter("user_last_name");
									if(ln!="" &&ln!=null)
									{  
										out.println();
										out.println(ln);
									}
								%>"></td>
							<td>
								<%
								String msg1 = (String) request.getAttribute("msg1");
								if (msg1 != null) {
									out.println(msg1);
								}
								%>
							</td>


						</tr>

						<tr>
							<td><label for="dob"><h6>
										Enter Dob
										<h6></label> <input type="date" name="user_dob"
								placeholder="enter dob" value="<%
								    String dob=(String)request.getParameter("user_dob");
									if(dob!=""||dob!=null)
									{
										out.println(dob);
									}
								    %>
								"></td>
							<td>
								<%
								String msg2 = (String) request.getAttribute("msg2");
								if (msg2 != null) {
									out.println(msg2);
								}
								%>
							</td>


						</tr>
						<tr>
							<td><label for="email"><h6>
										Enter Email
										<h6></label> <input type="email" name="user_email"
								placeholder="enter email" value="
									<%
								    String email=request.getParameter("user_email");
									if(email!="" && email!=null)
									{
										out.println(email);
									}
								%>
								
								"></td>
							<td>
								<%
								String msg3 = (String) request.getAttribute("msg3");
								if (msg3 != null && request.getParameter("user_email").equals("")) {
									out.println(msg3);
								}
								String msg8em = (String) request.getAttribute("msg8em");
								if (msg8em != null) {
									out.println(msg8em);
								}
								%>
							</td>


						</tr>

						<tr>
							<td><label for="phone"><h6>
										Enter Phone
										<h6></label> <input type="number" name="user_phone"
								placeholder="enter phone" value="
									<%
								    String phone=(String)request.getParameter("user_phone");
									if(phone!=""&&phone!=null)
									{
										out.println(phone);
									}
								   %>
								
								"></td>
							<td>
								<%
								String msg4 = (String) request.getAttribute("msg4");
								String msg9 = (String) request.getAttribute("msg9");
								String msg8ph = (String) request.getAttribute("msg8ph");
								if (msg4 != null && request.getParameter("user_phone").equals("")) {
									out.println(msg4);
								} 
								else if(msg9!=null &&request.getParameter("user_phone").length()>10||msg9!=null &&request.getParameter("user_phone").length()<10&&request.getParameter("user_phone").length()>0)
								{
									out.println(msg9);
								}
								else if (msg8ph != null) {
									out.println(msg8ph);
								}
								%>
							</td>
						<tr>


							<td><label for="password"><h6>
										Enter Password
										<h6></label> <input type="password" name="user_password"
								placeholder="enter password" ></td>
							<td>
								<%
								String msg5 = (String)request.getAttribute("msg5");
								String msg6 = (String)request.getAttribute("msg6");
								String msg7 = (String)request.getAttribute("msg7");
                                String password=request.getParameter("user_password");
								if (msg5 != null && password.equals("")) 
								{
									out.println(msg5);
								}
								else if (msg6!= null && password.length()<8) 
								{
									out.println(msg6);
								}
								else if(msg7!=null&&password_validation.iscorrectpassword(password)==false)
								{
									out.println(msg7);
								}
								%>
							</td>
						</tr>
						<tr>
							<td><input type="submit" value="Submit" class="btn1">
								<input type="reset" value="Reset" class="btn2"></td>
						</tr>
						
						

					</table>
				</form>
				<br>
			</div>
		</div>

	</div>
	<!-- starting js code here -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>