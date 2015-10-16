<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index page</title>
</head> 
<body >
<jsp:include page="../common/loginHeader.jsp"></jsp:include>
<br><br><br><br>
	<h1>Login:</h1>
	<form action="<%=getServletContext().getContextPath() + "/login"%>"
		method="post">
		user name: <input type="text" name="name" /><br>
		<br> password: <input type="text" name="password" /><br>
		<br> <input type="submit" value="Log-in"><br>
		<br> <a
			href="<%=getServletContext().getContextPath()
					+ "/jsp/register.jsp"%>">Register</a>

	</form>
	<div class="indeximg">
     <img  alt="India flag" src="./images/India.jpg" width="450" height="500">	
	</div>
	<br><br><br><br><br><br><br><br><br><br><br><br>
	<jsp:include page="../common/footer.jsp"></jsp:include>
</body>
</html>