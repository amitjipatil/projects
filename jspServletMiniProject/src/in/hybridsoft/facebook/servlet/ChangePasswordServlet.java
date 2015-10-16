package in.hybridsoft.facebook.servlet;

import in.hybridsoft.facebook.service.ChangePasswordService;
import in.hybridsoft.facebook.service.ChangePasswordServiceImpl;

import java.io.IOException;

import javax.servlet.http.*;
import javax.servlet.*;
public class ChangePasswordServlet extends HttpServlet{

	RequestDispatcher requestDispatcher;
	@Override
protected void doPost(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException {

	
	
	HttpSession session=req.getSession(false);
	
	if(req.getParameter("currentpass").equals(session.getAttribute("password")))
	{
		
	boolean bool=new ChangePasswordServiceImpl().changePassword(req.getParameter("newpass"),(String)session.getAttribute("name"));	
	
		if(bool)
		{
			requestDispatcher=req.getRequestDispatcher("/logout");
		}
		else
		{	requestDispatcher=req.getRequestDispatcher("jsp/changepassword.jsp");
		    System.out.println("aaaaaaaaaaaaaaaaaaa");
		
		}
	}
	else
		{requestDispatcher=req.getRequestDispatcher("jsp/changepassword.jsp");
		System.out.println("---------+++++---------");
		}
	
	 requestDispatcher.forward(req, res);
}
}
