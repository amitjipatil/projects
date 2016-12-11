<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>student registration</title>

</head>
<body bgcolor='pink'>


	<center>
		<h1>Student Registration</h1>
	</center>
	<br>
	<center>
		<table border="1">

			<form:form commandName="studentForm" id="studentForm"
				name="studentForm">
				<tr>
					<td>Id</td>
					<td><form:input path="id" /><br></td>
				</tr>
				<tr>
					<td>Name:</td>
					<td><form:input path="name" /><br></td>
				</tr>
				<tr>
					<td>Age:</td>
					<td><form:input path="age" /><br></td>
				</tr>
				<tr>
					<td>Address:</td>
					<td><form:input path="address" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="button" value="Register"
						onclick="addstudent()"></td>
				</tr>
			</form:form>
		</table>
		<br>
		<br>
		<table border="1" width="600">
			<tr>
				<th>Student ID</th>
				<th>Name</th>
				<th>Age</th>
				<th>Address</th>
			</tr>

			<c:forEach items="${slist}" var="item">
				<tr>
					<td>${item.id }</td>
					<td>${item.name }</td>
					<td>${item.age }</td>
					<td>${item.address }</td>
				</tr>
			</c:forEach>

		</table>
	</center>
	<script type="text/javascript">
		function addstudent() {
			studentForm.action = "addstudent";
			studentForm.submit();

		}
	</script>
</body>
</html>