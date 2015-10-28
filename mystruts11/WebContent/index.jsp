<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<body>
 
<s:form action="verify">
 
<s:textfield name="uname" label="Enter Username" /><br>
<s:password name="password" label="Enter Password" /><br>
<s:submit value="submit" align="center" />
 
</s:form>
</body>
</html>