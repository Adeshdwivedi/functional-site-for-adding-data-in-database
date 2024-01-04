<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Set new password</title>
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
	background-color: #f8bbd0;
	width: 194.5vh;
	height: 90vh;
}
.setform
{
    background-color: #a7ffeb; 
    width: 90vh;
    height: 70vh;
    margin-left: 300px;
    text-align:center;
    padding: 40px;
}


input
{ 
  text-align: center;
  width: 60vh;
  margin: auto;
}

.btn1
{
  width: 80px;
}

</style>


</head>
<body>
   <div class="container"> 
   <%@ include file="navbar.jsp"%>
    <div class="cont">
        <br>
        <div class="setform">
           
           <form action="" method="post">
               <br>
               <%
				response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");

               %>
               <br>
               <h4> Set-Password</h4>
               <br>
               <label for="phone"><h6>Enter Phone<h6></label>
		       <input type="text" name="user_phone" placeholder="enter phone" required="required">
		       <br>
		       <br>
		       <label for="password"><h6>Enter New Password<h6></label>
		       <input type="password" name="user_newpassword" placeholder="enter new password" required="required" >
               <br>
               <br>
               <input type="submit" value="submit" class="btn1">
               <input type="reset" value="reset" class="btn1">
                  
           </form>  
             
        </div>
    </div>
    
   </div>
</body>
</html>