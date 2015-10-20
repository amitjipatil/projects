package in.hybridsoft.facebook.dao;

import java.sql.Connection;
import java.sql.Statement;

import in.hybridsoft.facebook.util.MakeConnection;

public class AddNewEmailDaoImpl implements AddNewEmailDao {
	Connection con=MakeConnection.getConnection();
	
	@Override
	public boolean newEmail(String email, int uid) {
			System.out.println("8888888");
		String qry="insert into emaildetails (email,status,uid) values('"+email+"','yes',"+uid+")";
		try{
		Statement st=con.createStatement();
		int n=st.executeUpdate(qry);
		System.out.println(n);
		if(n==1)
			return true;
		else return false;
		}
		catch(Exception e)
		{}
		return false;
	}

	public boolean makePrimary(int id, int uid) {

		String qry="update emaildetails set status='yes' where id="+id;
		String qry1="update emaildetails set status='no' where id not in("+id+") and uid="+uid+" and status='no'";
	try{
		Statement st=con.createStatement();
		int n=st.executeUpdate(qry);
		int m=st.executeUpdate(qry1);
		
		if(n>0)
		{
			if(m>0)
			{
				
				return true;
				
			}
			
		}
	}
	catch(Exception e)
	{}
		return false;
	}

}
