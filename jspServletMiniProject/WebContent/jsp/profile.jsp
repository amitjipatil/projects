<%@ page import="in.hybridsoft.facebook.dao.GetData" %>
<%@page import="java.sql.ResultSet" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">





$(document).ready(
function (){
$("#EDIT").click(function(){
$("#EDIT").after("");

})
}
);


</script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile</title>
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
<br><br><br><br><br><br><br>
<%String n=(String)session.getAttribute("name"); 
  String p=(String)session.getAttribute("password");
  ResultSet resultset=GetData.selectProfile(n,p);
  
%>

<%!
int id=0;;
String s1=null,s2=null,s3=null,s4=null,s5=null,s6=null;%>
<%
while(resultset.next()){
s1=resultset.getString(5); 
s2=resultset.getString(7); 
s3=resultset.getString(2); 
s4=resultset.getString(3);
s5=resultset.getString(4);
id=resultset.getInt(1);
s6=resultset.getString(8);
 
} %>

user name:<%=s1 %><br>
mobile no:<%=s2 %><br>
first name:<%=s3 %><br>
last name:<%=s4 %><br>
mail id:<%=s5 %><br>
gender: <%=s6 %><br>

<%ResultSet resultset1=GetData.getProfile(id);%>
<%!
int pincode,uid;
String hobby,interest,address,secondemail,education;
%>
<%
while(resultset1.next()){
uid=resultset1.getInt(2);
hobby=resultset1.getString(4); 
interest=resultset1.getString(5); 
address=resultset1.getString(6); 
pincode=Integer.parseInt( resultset1.getString(7));
secondemail=resultset1.getString(8);
%>
 hobby:<%=hobby %><br>
interest:<%=interest %><br>
address:<%=address %><br>
pincode:<%=pincode %><br>
secondary email:<%=secondemail %><br>
education:<br>
<input type="button" id="EDIT"value="edit" >
<%} %>
<%if(uid==0) {%>

<form action="../addinfo" method="post" >
<input type="hidden" name="id" value="<%=id %>">
hobby:<input type="text" name="hobby"/><br>
interest:<input type="text" name="intrest"/><br>
address:<input type="text" name="address"/><br>
pincode:<input type="text" name="pincode"/><br>
secondary email:<input type="text" name="secondemail"/><br>

 add education:<br><select name="education" multiple="multiple">
  <option value="1" name="edu1">SSC</option>
  <option value="2" name="edu2">HSC</option>
  <option value="3" name="edu3">BSC</option>
  <option value="4" name="edu4">BCA</option>
</select><br> 
upload profile picture:<input type="file" name="imgfile"><br>
<input type="submit"  value="Save">
</form>
<%} %>
<br><br><br><br><br><br><br><br><br><br><br>
<jsp:include page="../common/footer.jsp"></jsp:include>
</body>
</html>