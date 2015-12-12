<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="update" >
 <s:textfield name="employee.eid" label="Enter eid" ></s:textfield>
  <s:textfield name="employee.ename" label="Enter ename"></s:textfield>
   <s:textfield name="employee.salary" label="Enter salary"></s:textfield>
 <s:submit value="submit"></s:submit>
  </s:form>
 
</body>
</html>