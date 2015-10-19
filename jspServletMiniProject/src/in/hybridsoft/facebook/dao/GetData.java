package in.hybridsoft.facebook.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import in.hybridsoft.facebook.util.MakeConnection;

public class GetData {
	static ResultSet rs;

	static public ResultSet selectData() {
		// System.out.println(a+" "+b);
		String qry = "select * from register ";
		Connection con = MakeConnection.getConnection();
		try {
			Statement st = con.createStatement();
			rs = st.executeQuery(qry);
			// System.out.println(rs.next());
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
    static public ResultSet selectProfile(String name,String password)
    {
    	String qry1 = "select * from register where username='"+name+"' and password='"+password+"'";
    	Connection con = MakeConnection.getConnection();
    	try {
			Statement st = con.createStatement();
			rs = st.executeQuery(qry1);
			// System.out.println(rs.next());
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return rs;
    }
    
    static public ResultSet selectEmail(int id)
    {
    	System.out.println("id="+id);
    	String qry2 = "select * from emaildetails where uid="+id;
    	Connection con = MakeConnection.getConnection();
    	try {
			Statement st = con.createStatement();
			rs = st.executeQuery(qry2);
			// System.out.println(rs.next());
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return rs;

    }
    
}
