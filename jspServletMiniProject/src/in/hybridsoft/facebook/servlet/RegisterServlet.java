package in.hybridsoft.facebook.servlet;

import in.hybridsoft.facebook.model.Register;
import in.hybridsoft.facebook.service.RegisterService;
import in.hybridsoft.facebook.service.RegisterServiceImpl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;
public class RegisterServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		System.out.println("------------5555555555555");
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String name=req.getParameter("name");
		String mob=req.getParameter("mobno");
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String mailid=req.getParameter("mailid");
		String password=req.getParameter("password");
		String sex=req.getParameter("sex");
		
	         Register register=new Register();
	         register.setName(name);
	         register.setMob(mob);
	         register.setFname(fname);
	         register.setLname(lname);
	         register.setMailid(mailid);
	         register.setPassword(password);
	         register.setSex(sex);
	         
	         
		
		RegisterService reg=new RegisterServiceImpl();
		Boolean bool=reg.save(register);
		//System.out.println(bool+"bbbbbbboooollll");
		if(bool)
		{
			//System.out.println(true+"?????????????");
			pw.print("<script>alert('Registration successfull');</script>");
			pw.print("<script>window.location='jsp/index.jsp';</script>");
			//res.sendRedirect("jsp/index.jsp");
			/*RequestDispatcher rd=req.getRequestDispatcher("jsp/index.jsp");
			rd.forward(req, res);*/
		
		}
		else
		{
			
			pw.print("<script>alert('Registration not successfull');</script>");
			pw.print("<script>window.location='jsp/register.jsp';</script>");
			//res.sendRedirect("jsp/register.jsp");
			//pw.print("Registration failed");
			
		}
	}

}
