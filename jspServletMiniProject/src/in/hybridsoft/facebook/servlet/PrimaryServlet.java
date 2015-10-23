package in.hybridsoft.facebook.servlet;
import in.hybridsoft.facebook.service.AddNewEmailServiceaImpl;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;
public class PrimaryServlet extends HttpServlet{

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
	
		RequestDispatcher rd=null;
		int id=Integer.parseInt(req.getParameter("id"));
		int uid=Integer.parseInt(req.getParameter("uid"));

	  AddNewEmailServiceaImpl addNewEmailServiceaImpl=new AddNewEmailServiceaImpl();
	 boolean bool=addNewEmailServiceaImpl.makePrimary(id,uid);
	System.out.println(bool+"---+++++----");
	 
		 
		 System.out.println("-------+++++++--------");
		 rd=req.getRequestDispatcher("/jsp/changeemail.jsp");
		 rd.forward(req, res);
		 
	 
	 
	}
	
}
