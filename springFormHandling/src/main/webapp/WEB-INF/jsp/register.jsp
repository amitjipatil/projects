<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<html>
<head>
<title>student registration</title>
<%-- <spring:url value="/resources/js/jquery.js" var="jqueryJS"/>
 --%>
<spring:url value="/resources/js/jquery.min.js" var="jqueryMin" />
<spring:url value="/resources/css/bootstrap.min.css" var="mainCss" />
<spring:url value="/resources/js/bootstrap.min.js" var="boot" />

<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script> -->

<link href="${mainCss}" rel="stylesheet" />
<script src="${jqueryMin}"></script>
<script src="${boot}"></script>

<%--  <script src="${jqueryJS}"></script> --%>

</head>
<body>

	<div class="well">
		<center>
			<h1>Student Registration</h1>
		</center>
	</div>
	<br>
	<div class="status alert alert-success" style="display: none"></div>
	<center>
		<table>

			<form:form commandName="studentForm" id="studentForm"
				name="studentForm">
				<tr>
					<td>Id *</td>
					<td><form:input path="id" class="form-control"
							required="required" value="${studentForm.id}" /><br></td>
				</tr>
				<tr>
					<td>Name *</td>
					<td><form:input path="name" class="form-control"
							required="required" value="${studentForm.name}" /><br></td>
				</tr>
				<tr>
					<td>Age *</td>
					<td><form:input path="age" class="form-control"
							required="required" value="${studentForm.age}" /><br></td>
				</tr>
				<tr>
					<td>Address *</td>
					<td><form:input path="address" class="form-control"
							required="required" value="${studentForm.address}" /></td>
				</tr>
				<tr>
					<td colspan="2"><button type="submit" name="Register"
							class="btn btn-success" required="required"
							onclick="addstudent()">Register</button></td>
				</tr>
			</form:form>
		</table>
		<br> <br>
		<table border="1" width="600">
			<tr>
				<th>Student ID</th>
				<th>Name</th>
				<th>Age</th>
				<th>Address</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>

			<c:forEach items="${slist}" var="item">
				<tr>
					<td>${item.id }</td>
					<td>${item.name }</td>
					<td>${item.age }</td>
					<td>${item.address }</td>
					<!-- <td><button type="button" name="update" class="btn btn-primary"  onclick="update()">Update</button></td>
					<td><button type="button" name="delete" class="btn btn-danger"  onclick="deleteit()">Delete</button></td>
		 -->
					<td><a href="update?id=${item.id }">Update</a></td>

					<td><a href="delete?id=${item.id }">Delete</a></td>
				</tr>
			</c:forEach>

		</table>
	</center>

	<!-- Button trigger modal -->
	<button type="button" class="btn btn-primary btn-lg"
		data-toggle="modal" data-target="#myModal">Launch demo modal
	</button>

	<!-- Modal -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Update Student</h4>
				</div>
				<div class="modal-body">Text box here</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Save changes</button>
				</div>
			</div>
		</div>
	</div>



	<script type="text/javascript">
		function addstudent() {
			studentForm.action = "addstudent";
			studentForm.submit();

		}

		function update() {
			studentForm.action = "update?";
			studentForm.submit();

		}

		function deleteit() {
			studentForm.action = "delete";
			studentForm.submit();

		}
	</script>
</body>
</html>