<html>
<head>
<title>Home-page</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous" />

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css"
	integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<style type="text/css">
body {
	color: red;
}

.bg_img {
	background-image: url("mycardarkimage.jpg");
	background-repeat: no-repeat;
	background-size: 1300px;
	widht: 100vh;
	height: 90vh;
	text-align: center;
	color: blue;
}

h1 {
	padding: 100px;
	color: red;
	text-decoration: none;
}

.a1 {
	font-size: 30px;
	border: none;
	border-radius: 7px;
	padding: 0px 10px 0px 10px;
	border: 1px solid red;
}

.a1:hover {
	text-decoration: none;
	color: red;
}

.primary-color {
	background-color: navy;
}
</style>
</head>

<body>

	<div class="container-fluid">
		<%@ include file="navbar.jsp"%>
		<div class="bg_img">
			<h1>Hello, Welcome to the Website</h1>
			<a class="a1" href="login.jsp">Start </a>
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