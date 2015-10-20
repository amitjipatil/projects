package in.hybridsoft.facebook.servlet;
import in.hybridsoft.facebook.service.AddNewEmailService;
import in.hybridsoft.facebook.service.AddNewEmailServiceaImpl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;
import javax.servlet.*;
public class AddNewEmailServlet extends HttpServlet{
 @Override
protected void service(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException {
	 RequestDispatcher rd=null;
System.out.println("in servlet");
PrintWriter pw=res.getWriter();
	String email= req.getParameter("email");
	int uid=Integer.parseInt(req.getParameter("uid"));
	System.out.println(email);
    System.out.println(uid);
	boolean bool;
//	AddNewEmailService addNewEmailService=;
	//bool=addNewEmailService.;
	if(new AddNewEmailServiceaImpl().newEmail(email,uid))
	{
		
		rd=req.getRequestDispatcher("/jsp/changeemail.jsp");
	//	pw.print("<script>window.location='jsp/changeemail.jsp';</script>");
		
		/*pw.print("<script>alert('email added successfully');</script>");
		pw.print("<script>window.location='jsp/changeemail.jsp';</script>");*/
		
	}
	else
		System.out.println("-------**********--------");
	System.out.println(res);
	rd.forward(req, res);
	 
 }
	
}
