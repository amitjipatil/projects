package in.hybridsoft.facebook.servlet;
import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;
public class ChangeEmailId extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		String n=(String) session.getAttribute("name");
		String p=(String) session.getAttribute("password");
		String mail=req.getParameter("currentmail");
		
		//public void checkMail();
		
	}

}
