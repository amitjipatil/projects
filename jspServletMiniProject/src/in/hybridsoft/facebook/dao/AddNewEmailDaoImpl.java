package in.hybridsoft.facebook.dao;

import java.sql.Connection;
import java.sql.Statement;

import in.hybridsoft.facebook.util.MakeConnection;

public class AddNewEmailDaoImpl implements AddNewEmailDao {

	@Override
	public boolean newEmail(String email, int uid) {
		Connection con=MakeConnection.getConnection();
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

}
