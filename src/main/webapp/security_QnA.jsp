<%@page import="com.cvweb.entities.user"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>security QnA</title>

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

.ques
{
    background-color: #eeeeee;
    width: 194.5vh;
    height: 90vh;
}
.QA
{
  margin-left: 20px;
}
#q1{
 margin-left: 10px;
}
#q2{
 margin-left: 10px;
}
#q3{
 margin-left: 8px;
}

</style>

</head>
<body>
 <div class="container">
 		<%@ include file="navbar.jsp"%>
 	
 		<div class="ques">
 		   <br>
 		   <form action="security_servlet" method="post" class="QA">
 		      
 		      <%
 		        HttpSession ses=request.getSession();
 		        user u1=(user)ses.getAttribute("user_detail");
				response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");

 		        ses.setAttribute("user_dt", u1);
               %>
 		   <h6> Answer these question, because it will required when user want to forgate there password.</h6>
 		   <br>
 		   <br>
 		    <lable>Q1.what is your favourite sports?</lable>
 		    <input type="text" name="user_sports" id="q1" required="required">
 		    <br>
 		    <br>
 		    <label>Q2.what is your book?</label>
 		    <input type="text" name="user_book" id="q2" required="required">
 		    <br>
 		    <br>
 		    <label>Q3.what is your favourite number ?</label>
 		    <input type="number" name="user_number" id="q3" required="required">
 		    <br>
 		    <br>
 		    <input type="submit" value="submit" >
 		    <input type="reset" value="reset" >
 		   
 		</div>
 
 </div>

</body>
</html>
