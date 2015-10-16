<%@page import="in.hybridsoft.facebook.dao.GetData" %>
<%@page import="java.sql.ResultSet" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>home</title>
</head>
<body>


	<%-- <%@ include file="../common/header.jsp" %> --%>
	<jsp:include page="../common/header.jsp"></jsp:include>
	<br>
	<br>
	<br>

	<img src="pic_mountain.jpg" alt="Mountain View"
		style="width: 204px; height: 208px;">

	<center>


	<table border="2">
		<tr>
			<th>USER ID</th>
			<th>USER NAME</th>
			<th>GENDER</th>
			<th>MOBILE NO</th>
			<th>MAIL ID</th>
		
		</tr>
         <%ResultSet resultset=GetData.selectData(); %>
		<%while(resultset.next()){%>
		<tr>
			<td>
				<%out.print(resultset.getInt(1));%>
			</td>
			<td>
				<%out.print(resultset.getString(5));%>
			</td>
			<td>
				<%out.print(resultset.getString(8));%>
			</td>
			<td>
				<%out.print(resultset.getString(7));%>
			</td>
			<td><%out.print(resultset.getString(4));%>	</td>	</tr>
		<% } %> 
	</table>
</center>

	<br>
	<br>
	<br>
	<jsp:include page="../common/footer.jsp"></jsp:include>
</body>
</html>