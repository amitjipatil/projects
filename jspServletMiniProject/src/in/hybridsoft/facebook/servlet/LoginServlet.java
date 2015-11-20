package in.hybridsoft.facebook.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import in.hybridsoft.facebook.service.*;
import java.io.*;

public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		RequestDispatcher rd;
		res.setContentType("text/html");
		HttpSession ses;
		
		String name = req.getParameter("username");
		String pwd = (String) req.getParameter("password");
		LoginServiceImpl ls = new LoginServiceImpl();
		System.out.println(name + " " + pwd);
		if (ls.validateLogin(name, pwd)) {
			ses = req.getSession();
			ses.setAttribute("name", name);

			ses.setAttribute("password", pwd);
			// req.setAttribute("pageindex",i);
			/*rd = req.getRequestDispatcher("/getpagination?pageindex=1");
			rd.forward(req, res);*/
			res.getWriter().write("success");
			return;
		} else
			/*rd = req.getRequestDispatcher("jsp/loginfailed.jsp");
		rd.forward(req, res);*/
			res.getWriter().write("failure");
		return;

	}

}
