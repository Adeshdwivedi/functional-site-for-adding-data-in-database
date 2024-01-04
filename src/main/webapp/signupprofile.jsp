<%@page import="com.cvweb.entities.user"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>signup-profile page</title>
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
	background-color: #84ffff;
	width: 194.5vh;
	height: 90vh;
}

.show {
	background: #ffcdd2;
	width: 70vh;
	height: 60vh;
	margin-left: 350px;
	border-radius: 8px;
	text-align: center;
	padding: 40px;
	color: #1a237e;
}
.H3
{
   color: red;
}
</style>
</head>
<body>
	<div class="container">
		<%@ include file="navbar.jsp"%>
		<div class="cont">
			<br>
			<div class="show">
				<br>
				<%
				HttpSession ses = request.getSession();
				user u1 = (user) ses.getAttribute("user_dtls");
				response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
				  if( u1!=null)
				  {
				%>
				<h3 class="H3">Profile page</h3>
				<br>
				
				<h3>
					hello ,
					<%=u1.getFname()%><br> We would love to share are content with
					you.
				</h3>
                 


                   <form action="logout_servlet" method="post">
                  <% ses.setAttribute("user_login",u1);%>
                  <input type="submit" value="log out">
                  <%
				   }
				  else
				  {
					  response.sendRedirect("login.jsp");
				  }
                  %>  
                  
                 </form>
			</div>
		</div>
	</div>
</body>
</html>