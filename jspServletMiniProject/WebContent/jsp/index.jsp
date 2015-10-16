<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index page</title>
<script type="text/javascript">
	function validateForm() {

		var x = document.myForm.name.value;
		var y = document.myForm.password.value;
		
		if (x == null || x == "") {
			alert(" enter name");
			return false;
		}

		if (y == null || y == "") {
			alert(" enter password");
			return false;
		}


	}
</script>

</head> 
<body >
<jsp:include page="../common/loginHeader.jsp"></jsp:include>
<br><br><br><br>
	<h1>Login:</h1>
	
	<form action="<%=getServletContext().getContextPath() + "/login"%>"
		method="post" name="myForm" >
		user name: <input type="text" name="name" /><br>
		<br> password: <input type="text" name="password" /><br>
		<br> <input type="submit" value="Log-in" onclick="return validateForm()">
		</form>
		
		<br>
		<br> <a
			href="<%=getServletContext().getContextPath()
					+ "/jsp/register.jsp"%>">Register</a>

	
	<div class="indeximg">
     <img  alt="India flag" src="<%=getServletContext().getContextPath()
					+ "/images/India.jpg"%>" width="450" height="500">	
	</div>
	<br><br><br><br><br><br><br><br><br><br><br>
	<jsp:include page="../common/footer.jsp"></jsp:include>
</body>
</html>