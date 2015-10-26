package in.hybridsoft.facebook.servlet;
import javax.servlet.*;
import javax.servlet.http.*;

import in.hybridsoft.facebook.service.*;

import java.io.*;
public class LoginServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		RequestDispatcher rd;
		res.setContentType("text/html");
		HttpSession ses;
		int i=1;
	   String name= req.getParameter("name");
	   String pwd=(String) req.getParameter("password");
	   LoginServiceImpl ls=new LoginServiceImpl();
	   System.out.println(name+" "+pwd);
		  if(ls.validateLogin(name,pwd))
	  {
		  ses=req.getSession();
	  ses.setAttribute("name",name);
	   
	  ses.setAttribute("password", pwd);
	  req.setAttribute("pageindex",i);
	        rd=req.getRequestDispatcher("/getpagination");
		rd.forward(req, res);
		return;
	  }
		  else
			   rd=req.getRequestDispatcher("jsp/loginfailed.jsp");
		rd.forward(req, res);
		return;
	
	}

	
	

}
