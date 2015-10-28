package in.hybridsoft.app.servletsession.mypack;

import javax.servlet.http.*;
import javax.servlet.*;

import java.util.*;
import java.io.*;
import org.apache.log4j.Logger;

/**
 * @author amit patil
 *
 */
public class Index extends HttpServlet {

	final static Logger logger = Logger.getLogger(Index.class);

	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String name = req.getParameter("name");
		String fname = req.getParameter("fname");
		String mstatus = req.getParameter("mstatus");
		// create new session
		HttpSession ses = req.getSession();
		ses.setAttribute("na", name);
		ses.setAttribute("fna", fname);
		try {
			int a = 10;
			int b = a / 0;
		} catch (ArithmeticException ex) {
			logger.error("Sorry, something wrong! please check.", ex);
		}
		logger.info("This is info : printf statement");
		if (mstatus == null)
			mstatus = "no";

		if (mstatus.equals("yes")) {
			pw.println("<h1>--More details form1--</h1><br>");
			pw.println("<form action='s2url' method='post'>");
			pw.println("spouse name:<input type='text' name='spname' /><br><br>");
			pw.println("no.of children:<input type='text' name='child' /><br><br>");
			pw.println("<input type='submit' value='submit' /><br>");

		} else {
			pw.println("<h1>--More details form2--</h1><br>");
			pw.println("<form action='s2url' method='post'>");
			pw.println("why do u want marry:<input type='text' name='st1' /><br><br>");
			pw.println("when do u wan marry:<input type='text' name='st2' /><br><br>");
			pw.println("<input type='submit' value='submit' /><br>");

		}
		pw.close();
	}
}
