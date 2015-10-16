package in.hybridsoft.facebook.servlet;
import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;
public class LogoutServlet extends HttpServlet{
  @Override
protected void service(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException {
	  
	 
	HttpSession ses=req.getSession(false);
	ses.invalidate();
	RequestDispatcher rd=req.getRequestDispatcher("jsp/index.jsp");
	rd.forward(req, res);
}

}
