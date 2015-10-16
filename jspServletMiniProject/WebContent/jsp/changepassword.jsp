<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change password</title>
<script type="text/javascript">
function validateForm() {
alert("x");
    var x = document.myForm.currentpass.value;
    var y = document.myForm.newtpass.value;
    var z = document.myForm.confirmpass.value;
   /*   var y = document.forms["myForm"]["newpass"].value;
      var z = document.forms["myForm"]["confirmpas"].value; */
      alert(y);
      alert(z);
    /* if (x == null || x == "") {
        alert(" enter current password");
        return false;
    }
    
    if (y == null || y == "") {
        alert(" enter new password");
        return false;
    }
    
    if (z == null || z == "") {
        alert(" enter confm password");
        return false;
    }
    
    if (y!=z) {
        alert(" new password and confm password shuld be match");
        return false;
    } */
    
}
</script>
</head>
<body>
<jsp:include page="../common/header.jsp"></jsp:include>
<br><br><br>

<h1>Change password:</h1><br>


<form name="myForm" action="<%=getServletContext().getContextPath() + "/changepass"%>"  method="post">
current password:<input type="text" name="currentpass"><br>
New Password:<input type="text" name="newpass"><br>
confirm password:<input type="text" name="confirmpass"><br>
<input type="submit" value="change pwd" onclick="return validateForm()">
</form>
<br><br><br><br><br><br><br><br><br><br><br><br>
<jsp:include page="../common/footer.jsp"></jsp:include>

</body>
</html>