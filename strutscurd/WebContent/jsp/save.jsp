<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Save data</title>
</head>
<body>
<s:form method="post" action="../save.action">
<s:textfield name="employee.eid" label="Enter eid"></s:textfield><br>
<s:textfield name="employee.ename" label="Enter name"></s:textfield><br>
<s:textfield name="employee.salary" label="Enter salary"></s:textfield><br>
<s:submit value="save it"></s:submit>
 
 </s:form>

</body>
</html>