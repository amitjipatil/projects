<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<%-- <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet" /> 
   
   
     <script src="<c:url value="${pageContext.request.contextPath}/resources/js/bootstrap.min.js" />"></script>
    --%>
    
    <spring:url value="/resources/css/bootstrap.min.css" var="mainCss" />
	<spring:url value="/resources/js/bootstrap.min.js" var="boot" />
	
	<link href="${mainCss}" rel="stylesheet" />
    <script src="${boot}"></script>


<title>Login</title>
</head>
<body >
	<div class="well"><center>
		<h1>Login..</h1>
	</center></div>
	 <div class="status alert alert-success" style="display: none"></div>
 

   <form id="main-contact-form" class="contact-form" name="contact-form" method="post" action="sendemail.php">

 
    <div class="col-sm-5 col-sm-offset-1">
  
         <div class="form-group">
  
              <label>Name *</label>
 
                           <input type="text" name="name" class="form-control" required="required">


     </div>
 
                     
  <div class="form-group">
  
            <label>Email *</label>
   
                   <input type="email" name="email" class="form-control" required="required">
 
   </div>
                     

   <div class="form-group">
   
           <label>Phone</label>
    
                        <input type="number" class="form-control">
 
   </div>
  
                        
  <div class="form-group">
 
                 <label>Company Name</label>
 
                           <input type="text" class="form-control">
 
   </div>       
                 
                   
 </div>
    
               
 <div class="col-sm-5">
   
          <div class="form-group">
   
                  <label>Subject *</label>
  
                          <input type="text" name="subject" class="form-control" required="required">
  
                      </div>
                        
<div class="form-group">
                        
    <label>Message *</label>
                           
 <textarea name="message" id="message" required="required" class="form-control" rows="8"></textarea>
 
 </div>                        
                       
 <div class="form-group">
                           
 <button type="submit" name="submit" class="btn btn-success" required="required">Submit Message</button>
   
  </div>
                   
 </div>
          
      </form> 
         
   </div><!--/.row-->
	
	
	<br>
	<center>
		<h3>
			<font color='red'>${ErrorMessage}</font>
		</h3>
		<table>

			<form:form commandName="login" id="loginForm" name="loginForm">
				<tr>
					<td>UserId</td>
					<td><form:input path="userid" /><br></td>
				</tr>
				<tr>
					<td>Password *</td>
					<td><form:input path="password" class="form-control" required="required" /><br></td>
				</tr>

				<tr>
					<td colspan="2"><input type="button" value="Login" class="btn btn-success" required="required"
						onclick="login()"></td>
				</tr>
			</form:form>
		</table>
	</center>
	<script type="text/javascript">
		function login() {
			loginForm.action = "checklogin";
			loginForm.submit();

		}
	</script>
</body>
</html>