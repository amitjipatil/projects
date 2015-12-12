<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>display</title>
<script type="text/javascript" src="./resources/jquerymin.js"></script>
<script type="text/javascript" src="./resources/ajax1.js"></script>

</head>
<body>

<table id="tbl_data" border="1">

<tr>
<th>emp no</th><th>name</th><th>salary</th><th>update</th><th>delete</th>
</tr>
<s:iterator value="alList">
  
<tr>
<td class="v1"><s:property value="eid" /></td><td class="v2"><s:property value="ename" /></td><td class="v3"><s:property value="salary" /></td>
<td><a href="eid=<s:property value="eid" />">update</a> </td>
<td><a href="delete.action?employee.eid=<s:property value="eid" />">delete</a> </td>
</tr>
</s:iterator>
</table>



<a href="jsp/save.jsp">add new employee</a>
<%-- <script type="text/javascript">
 setTimeout(function(){window.location="display.action";},2000);
 
</script> --%>
</body>
</html>