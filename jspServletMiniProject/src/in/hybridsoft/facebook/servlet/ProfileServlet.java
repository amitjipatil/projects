package in.hybridsoft.facebook.servlet;

import in.hybridsoft.facebook.model.Profile;
import in.hybridsoft.facebook.service.ProfileService;
import in.hybridsoft.facebook.service.ProfileServiceImpl;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

import javazoom.upload.MultipartFormDataRequest;
import javazoom.upload.UploadBean;

public class ProfileServlet extends HttpServlet{
	RequestDispatcher rd;
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
	
		String arr[]=req.getParameterValues("education");
		int myarr[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int j=Integer.parseInt(arr[i]);
			myarr[i]=j;
		}
		
		 
	res.setContentType("text/html");
		HttpSession session=req.getSession(false);
	session.getAttribute("name");
	session.getAttribute("password");
	
	
	int id=Integer.parseInt(req.getParameter("id"));
	String imgfile=req.getParameter("imgfile");
	String hobby=req.getParameter("hobby");
	String intrest=req.getParameter("intrest");
	String address=req.getParameter("address");
	int pincode=Integer.parseInt(req.getParameter("pincode"));
	String secondemail=req.getParameter("secondemail");
	
         Profile profile=new Profile(); 
        
         profile.setMyarr(myarr);
         
        profile.setRegid(id);
        profile.setImage_url(imgfile);
        profile.setHobby(hobby);
        profile.setIntrest(intrest);
        profile.setAddress(address);
        profile.setPincode(pincode);
        profile.setSecondary_email(secondemail);
        
        ProfileService ps=new ProfileServiceImpl();
        Boolean bool=ps.save(profile);
       
        //file upload code
        try
		{
			UploadBean upb=new UploadBean();
			upb.setFolderstore("d:/store");
			upb.setOverwrite(false);
			MultipartFormDataRequest mreq=new MultipartFormDataRequest(req);
			upb.store(mreq);
			// it completes file uploading
				}
		catch(Exception e)
		{
			e.printStackTrace();
		}
        if(bool)
        {
        	rd=req.getRequestDispatcher("jsp/profile.jsp");
       
        }
        else
        {
        	rd=req.getRequestDispatcher("jsp/profile.jsp");
       
        }
         
        rd.forward(req, res);  
		
	}
}
