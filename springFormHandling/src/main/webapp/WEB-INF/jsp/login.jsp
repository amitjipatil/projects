<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
   <spring:url value="/resources/css/bootstrap.min.css" var="mainCss" />
	<spring:url value="/resources/js/bootstrap.min.js" var="boot" />
	
	<link href="${mainCss}" rel="stylesheet" />
    <script src="${boot}"></script>


<title>Login</title>
</head>
<body >
	<div class="well"><center>
		<h1>Login..</h1>
	</center></div>
	 <div class="status alert alert-success" style="display: none"></div>
 

  
	
	<br>
	<center>
		<h3>
			<font color='red'>${ErrorMessage}</font>
		</h3>
		<table>

			<form:form commandName="login" id="loginForm" name="loginForm">
				<tr>
					<td>UserId *</td>
					
					<td><form:input path="userid" class="form-control" required="required" /><br></td>
				</tr>
				<tr>
					<td>Password *</td>
					<td><form:input path="password" class="form-control" required="required" /><br></td>
				</tr>

				<tr>
					
						<td>
						<button type="submit" name="submit" class="btn btn-success" required="required" onclick="login()">Submit</button>
						
				</tr>
			</form:form>
		</table>
	</center>
	<script type="text/javascript">
		function login() {
			loginForm.action = "checklogin";
			loginForm.submit();

		}
	</script>
</body>
</html>