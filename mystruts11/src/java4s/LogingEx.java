package java4s;
import com.opensymphony.xwork2.ActionSupport;

import java.sql.*;
import java.io.*;
public class LogingEx extends ActionSupport{
	private static final long serialVersionUID = 1L;
 
	private String uname,password;
	
	public String getUname() {
		return uname;
	}
 
	public void setUname(String uname) {
		this.uname = uname;
	}
 
	public String getPassword() {
		return password;
	}
 
	public void setPassword(String password) {
		this.password = password;
	}
 
	public String execute() throws IOException,SQLException, ClassNotFoundException
	{
		System.out.println("-------------------");
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
            PreparedStatement ps=con.prepareStatement("select count(*) from login where uid=? and name=?");
            int count=0;
			ps.setString(1,uname);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			
			if (rs.next())
			{
				count=rs.getInt(1);
			}
			if (count==0)
			{
				return ERROR;
			}
			else
				return SUCCESS;
		
		
	
	}
 
}