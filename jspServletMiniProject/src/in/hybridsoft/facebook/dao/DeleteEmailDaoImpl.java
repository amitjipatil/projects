package in.hybridsoft.facebook.dao;

import java.sql.Connection;
import java.sql.Statement;

import in.hybridsoft.facebook.util.MakeConnection;

public class DeleteEmailDaoImpl implements DeleteEmailDao {

	Connection con;
	@Override
	public boolean deleteEmail(int id) {
		try
		{
			String qry="delete from emaildetails where id="+id;
		con=MakeConnection.getConnection();
		Statement st=con.createStatement();
		int i=st.executeUpdate(qry);
		if(i==1)
			return true;
		else return false;
		}
		catch(Exception e)
		{}
		return false;
	}

}
