<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
<link rel="stylesheet" type="text/css" href="<%=getServletContext().getContextPath()+"/resources/StyleSheet.css"%>">

</head>
<body>
<div class="navigation">

       <ul id="nav_links">
    		<li class="hom"><a href="<%=getServletContext().getContextPath()+"/getpagination?pageindex=1"%>">HOME</a></li>
    		<li class="campus">ABOUT US
    		<ul class="sub_nav">
		
    		        <a href="../jsp/history.jsp"><li >History</li></a>
    		     <a href="../jsp/mission.jsp"><li>Mission & Vision</li></a>
    		       <a href="../jsp/board.jsp"><li>Board body</li></a>
    		        <a href="../jsp/contactus.jsp"><li>contact us</li></a>
                    </ul>
                 </li>
    		    
    		
    		<li class="depo"><a href="<%=getServletContext().getContextPath()+"/jsp/profile.jsp"%>">PROFILE</a>
    		        </li>
    		
    	
    		<li class="event">ACCOUNT SETTING
    		      <ul class="sub_nav4">
    		          <a href="<%=getServletContext().getContextPath()+"/jsp/changepassword.jsp"%>"><li>ChangePasword</li></a>
    		        <a href="<%=getServletContext().getContextPath()+"/jsp/changeemail.jsp"%>"><li>Change Emailid</li></a>
    		      </ul>
    		
    		</li>
    		<a href="<%=getServletContext().getContextPath()+"/logout"%>"><li class="contact">LOGOUT</li></a>
    		<li class="event">
    		<font color="yellow">Welcome</font>&nbsp;&nbsp;
<% String s=(String)session.getAttribute("name"); %>
<font color="purple"><b><%=s %></b></font>
    		
    		</li>
    	
    		</ul> 
</div>

</body>
</html>