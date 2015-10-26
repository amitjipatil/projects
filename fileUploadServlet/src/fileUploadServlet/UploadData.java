package fileUploadServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javazoom.upload.MultipartFormDataRequest;
import javazoom.upload.UploadBean;

import javax.servlet.http.*;
import javax.servlet.*;
public class UploadData extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException
	{
		try
		{
			UploadBean upb=new UploadBean();
			upb.setFolderstore("d:/store");
			upb.setOverwrite(false);
			MultipartFormDataRequest mreq=new MultipartFormDataRequest(req);
			upb.store(mreq);
			// it completes file uploading
			RequestDispatcher rd=req.getRequestDispatcher("uploadSuccess.jsp");
			rd.forward(req, res);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
 