<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
<form>
current email:<input type="text" name="currentmail"/><br>
new mail:<input type="text" name="newmail"><br>
<input type="submit" value="addmail">
</form>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<jsp:include page="../common/footer.jsp"></jsp:include>

</body>
</html>