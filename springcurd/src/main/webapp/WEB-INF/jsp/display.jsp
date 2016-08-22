<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ page isELIgnored="false"%>
<html>
<head>
<title>Employees</title>
</head>
<body>
<h1>Employee Details:</h1><br><br>
<table border="1">
<tr><th>EMPLOYEE ID</th> <th>EMPLOYEE NAME</th> <th>SALARY</th><th>UPDATE</th><th><b></b>DELETE</th> </tr>
<c:forEach items="${elist}" var="element"> 
  <tr>
    <td>${element.eid}</td>
    <td>${element.ename}</td>
    <td>${element.salary}</td>
    <td><a href="${pageContext.request.contextPath}/updateEmployee/?EmployeeId=${element.eid}">Edit</a>
    </td>
    <td><a href="${pageContext.request.contextPath}/deleteEmployee/?EmployeeId=${element.eid}">Delete</a></td>
  </tr>
</c:forEach>
</table>

</body>
</html>