package in.hybridsoft.facebook.servlet;
import in.hybridsoft.facebook.model.Profile;
import in.hybridsoft.facebook.service.ProfileService;
import in.hybridsoft.facebook.service.ProfileServiceImpl;

import java.io.IOException;


import javax.servlet.*;
import javax.servlet.http.*;
public class ProfileServlet extends HttpServlet{
	RequestDispatcher rd;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
	res.setContentType("text/html");
	
	
	int id=Integer.parseInt(req.getParameter("id"));
	String imgfile=req.getParameter("imgfile");
	String hobby=req.getParameter("hobby");
	String intrest=req.getParameter("intrest");
	String address=req.getParameter("address");
	int pincode=Integer.parseInt(req.getParameter("pincode"));
	String secondemail=req.getParameter("secondemail");
	
         Profile profile=new Profile(); 
         
        profile.setRegid(id);
        profile.setImage_url(imgfile);
        profile.setHobby(hobby);
        profile.setIntrest(intrest);
        profile.setAddress(address);
        profile.setPincode(pincode);
        profile.setSecondary_email(secondemail);
        
        ProfileService ps=new ProfileServiceImpl();
        Boolean bool=ps.save(profile);
        if(bool)
        {
        	rd=req.getRequestDispatcher("jsp/home.jsp");
        	//rd.forward(req, res);
        }
        else
        {
        	rd=req.getRequestDispatcher("jsp/profile.jsp");
        	//rd.forward(req, res);
        }
         
        rd.forward(req, res);  
		
	}
}
