package in.hybridsoft.app.servletsession.mypack;

import javax.servlet.http.*;
import javax.servlet.*;

import java.util.*;
import java.io.*;

public class Display extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
	{
		doPost(req, res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		try
		{
			//use existing session 
		HttpSession ses=req.getSession(false);
	           	//pw=res.getWriter();
	String s=(String)ses.getAttribute("na");
	String s1=(String)ses.getAttribute("fna");
	System.out.println(s);
	System.out.println(s1);
	res.setContentType("text/html");
	String spouse=req.getParameter("spname");
	String child=req.getParameter("child");
	String when=req.getParameter("st1");
	String why=req.getParameter("st2");
	
	pw.println("<h3>name: </h3>"+s+"<h3> fathers name: </h3>"+s1+"<h3> spouse name: </h3>"+spouse+" <h3>no.of children : </h3>"+child+"  ");

	//ses.invalidate();
		}
		catch(NullPointerException ne)
		{
			pw.println("<h1>pleasse login ............</h1>");
		}
	
	}
	
}
