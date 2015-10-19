<%@page import="in.hybridsoft.facebook.dao.GetData" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="javax.servlet.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function deleteemail(th)
 {
 }


</script>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change email</title>
</head>
<body>
<%! RequestDispatcher rd; %>
<%

if(session.getAttribute("name")==null)
{ rd=request.getRequestDispatcher("../jsp/index.jsp");
 rd.forward(request, response);
 }
 %>

<jsp:include page="../common/header.jsp"></jsp:include>
<br><br><br>

<h1>change email id:</h1><br>
<form action="/changeemail" method="post">
 <%String n=(String)session.getAttribute("name"); 
  String p=(String)session.getAttribute("password");
  ResultSet resultset=GetData.selectProfile(n,p);
 %>
 
<%! int id; %>
<%while(resultset.next()){ %>
<%id=resultset.getInt(1);}%>
<%ResultSet resultset1=GetData.selectEmail(id); %>

<table border="1">
<tr>
<th>PRIMARY</th><th>EMAIL-ID</th><th>DELETE</th>
</tr>
<%while(resultset1.next()){%>
		<tr>
			<td>
			<% if(resultset1.getString(3).equals("yes")){%>
				<input type="radio" name="radio1" checked="checked">
				<%}else {%>
				 <input type="radio" name="radio1"><%} %>
				
			</td>
			<td>
				<%out.print(resultset1.getString(2));%>
			</td>
			<td>
			<%!int i=0; %>
			<%i=resultset1.getInt(1); %>
				<a href="<%=getServletContext().getContextPath()+"/deleteemail?id="+i%>">delete</a>
				<a href="/ggg"  name="" ></a>
			</td>
			
				</tr>
		<% } %> 
</table>
<input type="submit" value="addNew">
</form>
<br><br><br><br><br><br><br><br>
<br><br><br><br><br><br><br><br>
<jsp:include page="../common/footer.jsp"></jsp:include>

</body>
</html>