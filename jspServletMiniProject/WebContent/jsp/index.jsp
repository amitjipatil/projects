
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index page</title>
<script type="text/javascript" src="./resources/jquerymin.js"></script>
<script type="text/javascript" src="./resources/ajax1.js"></script>


</head>
<body>
	<jsp:include page="../common/loginHeader.jsp"></jsp:include>
	<br>
	<br>
	<br>
	<div id="success"
		style="width: 50%; text-align: center; display: none; font-weight: bold; color: green;">
		<center>
			<h2>Login Success...!</h2>
		</center>
	</div>

	<div id="failure"
		style="width: 50%; text-align: center; display: none; font-weight: bold; color: red;">
		<center>
			<h2>Login Failure...!</h2>
		</center>
	</div>

	<br>
	<br>
	<br>
	<br>
	<h1>Login:</h1>
	<div>


		user name: <input type="text" id="name" required /><br> <br>
		password: <input type="password" id="password" name="password"
			required /><br> <br> <input type="button" id="log"
			value="Log-in">

	</div>
	<br>
	<br>
	<a
		href="<%=getServletContext().getContextPath()
					+ "/jsp/register.jsp"%>">Register</a>


	<div class="indeximg">
		<img alt="India flag"
			src="<%=getServletContext().getContextPath()
					+ "/images/India.jpg"%>"
			width="450" height="500">
	</div>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<jsp:include page="../common/footer.jsp"></jsp:include>
</body>
</html>