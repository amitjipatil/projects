<%@page import="in.hybridsoft.facebook.dao.GetData"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="javax.servlet.*"%>
<%@page import="java.util.*"%>
<%@page import="in.hybridsoft.facebook.model.Register"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>home</title>



</head>
<body>
	<%!RequestDispatcher rd;%>
	<%
		if (session.getAttribute("name") == null) {
			rd = request.getRequestDispatcher("../jsp/index.jsp");
			rd.forward(request, response);
		}
	%>

	<jsp:include page="../common/header.jsp"></jsp:include>

	<br>
	<br>
	<br>

	<img src="/images/pic_mountain.jpg" alt="Mountain View"
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
			<%
				ArrayList<Register> list = (ArrayList) request
						.getAttribute("listdata");
				Iterator iterator = list.iterator();
			%>

			<%
				while (iterator.hasNext()) {
					Register register = (Register) iterator.next();
			%>
			<tr>
				<td>
					<%
						out.print(register.getId());
					%>
				</td>
				<td>
					<%
						out.print(register.getName());
					%>
				</td>
				<td>
					<%
						out.print(register.getSex());
					%>
				</td>
				<td>
					<%
						out.print(register.getMob());
					%>
				</td>
				<td>
					<%
						out.print(register.getMailid());
					%>
				</td>
			</tr>
			<%
				}
			%>
		</table>
	</center>
	<center>
		<table>
			<tr>
				<td><a
					href="<%=getServletContext().getContextPath()
					+ "/getpagination?pageindex="+request.getAttribute("previus")%>">Previous</a></td>
				<td><a
					href="<%=getServletContext().getContextPath()
					+ "/getpagination?pageindex="+request.getAttribute("next")%>">Next</a></td>
			</tr>
		</table>
	</center>
	<br>
	<br>
	<br>
	<jsp:include page="../common/footer.jsp"></jsp:include>
</body>
</html>