<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body >
<jsp:include page="../common/loginHeader.jsp"></jsp:include><br><br>
<h1>Register here:</h1>

  


<br>
<form action="../register" method="post">
user name:<input type="text" name="name"/><br><br>
mobile mo:<input type="text" name="mobno"/><br><br>
first name:<input type="text" name="fname"/><br><br>
last name:&nbsp;&nbsp;&nbsp;<input type="text" name="lname"/><br><br>
mail id:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="text" name="mailid"/><br><br>
password:&nbsp;<input type="text" name="password"/><br><br>
cnfm paswd:<input type="text" name="confirm"/><br><br>
Gender:  <input type="radio" name="sex" value="male" checked>Male
  &nbsp;&nbsp;&nbsp;
  <input type="radio" name="sex" value="female">Female<br><br>
  
  <input type="submit" value="register">
<br><br><br>

	<jsp:include page="../common/footer.jsp"></jsp:include>

</form>
</body>
</html>