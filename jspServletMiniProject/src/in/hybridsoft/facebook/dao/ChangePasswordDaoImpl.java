package in.hybridsoft.facebook.dao;

import in.hybridsoft.facebook.util.MakeConnection;

import java.sql.Connection;
import java.sql.Statement;

public class ChangePasswordDaoImpl implements ChangePasswordDao {

	@Override
	public boolean changePassword(String newpass, String uname) {
		System.out.println(newpass+" dao layer "+uname);
		Connection con=MakeConnection.getConnection(); 
		try
		{
		String qry="update register set password='"+newpass+"' where username='"+uname+"'";
		Statement st=con.createStatement();
		int m=st.executeUpdate(qry);
		System.out.println("m="+m);
		if(m==1)
		{
			return true;
		}
			
		else return false;
		
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
		return false;
	}
}
