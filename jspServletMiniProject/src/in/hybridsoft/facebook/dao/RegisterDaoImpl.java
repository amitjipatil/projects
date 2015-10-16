package in.hybridsoft.facebook.dao;

import in.hybridsoft.facebook.model.Register;
import in.hybridsoft.facebook.util.MakeConnection;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

public class RegisterDaoImpl implements RegisterDao {	
	private String name;
	private String mob;
	private String fname;
	private String lname;
	private String mailid;
	private String password;
	private String sex;
	@Override
	public boolean save(Register r) {
	
		try
		{
			name=r.getName();
			mob=r.getMob();
			long mob1=Long.parseLong(mob);
			fname=r.getFname();
			lname=r.getLname();
			mailid=r.getMailid();
			password=r.getPassword();
			sex=r.getSex();
			String qry="insert into register(fname,lname,emailid,username,password,mobileno,gender) values('"+fname+"','"+lname+"','"+mailid+"','"+name+"','"+password+"','"+mob1+"','"+sex+"')";
			
					Connection con=MakeConnection.getConnection();
	    Statement st=con.createStatement();
	    int n=st.executeUpdate(qry);
	    System.out.println(n+"------");
	    if(n==1)
	    	return true;
	    else
	    	return false;
	    
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return false;
	}

}
