package in.hybridsoft.facebook.servlet;
import in.hybridsoft.facebook.service.DeleteEmailService;
import in.hybridsoft.facebook.service.DeleteEmailServiceImpl;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;
public class DeleteEmailServlet extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException {
	 System.out.println("fgvxghwdj");
	 
	RequestDispatcher rd = null;
   int id=Integer.parseInt(req.getParameter("id"));
   if(new DeleteEmailServiceImpl().deleteEmail(id))
   {
	   rd=req.getRequestDispatcher("/jsp/changeemail.jsp");
   }
   rd.forward(req,res);
}	 

}
