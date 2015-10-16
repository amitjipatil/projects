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
	   String name= req.getParameter("name");
	   String pwd=(String) req.getParameter("password");
	   LoginServiceImpl ls=new LoginServiceImpl();
	   System.out.println(name+" "+pwd);
	//  boolean bool= 
	 // System.out.println(bool+"a");
	  if(ls.validateLogin(name,pwd))
	  {
		  ses=req.getSession();
	  ses.setAttribute("name",name);
	  ses.setAttribute("password", pwd);
	        rd=req.getRequestDispatcher("jsp/home.jsp");
		rd.forward(req, res);
		return;
	  }
		  else
			   rd=req.getRequestDispatcher("jsp/loginfailed.jsp");
		rd.forward(req, res);
		return;
	
	}

	
	

}
