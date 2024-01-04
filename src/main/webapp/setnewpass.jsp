<%@page import="com.cvweb.entities.user"%>
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
	crossorigin="anonymous"/>
	<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css"
	integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />

<style type="text/css">
.primary-color {
	background-color: navy;
}

.cont {
	background-color: #536dfe;
	width: 194.5vh;
	height: 90vh;
}

.contain {
	background: #ffe57f;
	width: 100vh;
	height: 60vh;
	margin-left: 275px;
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
.msg
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

				<form action="setnewpass_servlet" method="post">
				    <%  HttpSession ses=request.getSession();
				        user u1=(user)ses.getAttribute("user_ids");
						response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
				        ses.setAttribute("user_ids2", u1);
				    %>
				    <table>
				     <tr>
				     <td>
				     <h3>Set Password</h3>
				     </td>
				     </tr>
				     <tr>
				     <td>
					<label for="text"><h6>	Enter Phone<h6></label> 
					<input type="text" name="user_phone" placeholder="enter  phone" >
					</td>
					<td>
					<%
					  String msg2=(String)request.getAttribute("msg2");
						if(msg2!=null)
						{
							out.println(msg2);
						}
					%>
					</td>
					</tr>
					<tr>
					<td>
			        <label for="password"><h6>	Enter New Password<h6></label> 
					<input type="password" name="user_new_password" placeholder="enter password" >
					</td>
					<td>
					  <% 
					     String msg=(String)request.getAttribute("msg");
						 String msg1=(String)request.getAttribute("msg1");
						 if(msg!=null && request.getParameter("user_new_password").trim().length()>=8 )
						 {
							 out.println(msg);
						 }
                         if(msg1!=null && request.getParameter("user_new_password").trim().length()<8)
                         {
							 out.println(msg1);
 
                         }
 
					  %>
					</td>
				    </tr>
				    <tr>
				    <td>
		            <input type="submit" value="Submit" class="btn1">
		            <input type="reset" value="Reset" class="btn2"> 
		            </td>
		            </tr>
		            <br>
		            <tr>
		             <td>
		             
		             <span class="msg">
		              <%
		                 String msg3=(String)request.getAttribute("msg4");
		                 if(msg3!=null)
		                 {
		                	 out.println(msg3);
		                 }
		              %>
		              </span>
		             </td>
		            </tr>
					</table>
				</form>
			</div>

		</div>

	</div>

</body>
</html>
