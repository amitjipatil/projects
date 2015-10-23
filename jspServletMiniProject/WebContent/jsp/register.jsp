<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function validateForm() {

			var y = document.myForm.password.value;
		var z = document.myForm.confirm.value;

		
		if (y != z) {
			alert("  password and confm password shuld be match");
			return false;
		}

	}
</script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body >
<jsp:include page="../common/loginHeader.jsp"></jsp:include><br><br>
<h1>Register here:</h1>

  


<br>
<form  name="myForm" action="../register" method="post">
user name:<input type="text" name="name" required/><br><br>
mobile mo:<input type="text" name="mobno"required/><br><br>
first name:<input type="text" name="fname" required/><br><br>
last name:&nbsp;&nbsp;&nbsp;<input type="text" name="lname" required/><br><br>
mail id:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="text" name="mailid" required/><br><br>
password:&nbsp;<input type="password" name="password" required/><br><br>
cnfm paswd:<input type="password" name="confirm" required/><br><br>
Gender:  <input type="radio" name="sex" value="male" checked>Male
  &nbsp;&nbsp;&nbsp;
  <input type="radio" name="sex" value="female">Female<br><br>
  
  <input type="submit" value="register" onclick="return validateForm()"/>
<br><br><br>

	<jsp:include page="../common/footer.jsp"></jsp:include>

</form>
</body>
</html>