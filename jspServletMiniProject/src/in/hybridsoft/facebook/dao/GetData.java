package in.hybridsoft.facebook.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import in.hybridsoft.facebook.model.Register;
import in.hybridsoft.facebook.util.MakeConnection;

public class GetData {
	static int recordcount, pages, start;
	static ResultSet rs;
	static Connection con;
	static Statement st;
	static int range = 2;
	static List<Register> list;
	

	static public List<Register> selectData(int index) {
		// System.out.println(a+" "+b);
		String qry1 = "select count(*) from register";

		try {
			con = MakeConnection.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(qry1);
			
			while (rs.next()) {
				recordcount = rs.getInt(1);
			}
			
			pages = recordcount / 2;
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			if (index <= pages) {
				start = (index-1) * 2;
					list = new ArrayList<Register>();
				String qry = "select * from register limit "+start+","+range;
				con = MakeConnection.getConnection();
				st = con.createStatement();
				rs = st.executeQuery(qry);
				
				
				while (rs.next()) {
					Register register = new Register();
					register.setId(rs.getInt(1));
					register.setName(rs.getString(5));
					register.setSex(rs.getString(8));
					register.setMob(rs.getString(7));
					register.setMailid(rs.getString(4));
					list.add(register);

				}

			}

		} catch (Exception e) {
		}
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()+"llllllllllooooo");
		}
		return list;
	}

	static public ResultSet selectProfile(String name, String password) {
		String qry1 = "select * from register where username='" + name
				+ "' and password='" + password + "'";
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

	static public ResultSet selectEmail(int id) {

		String qry2 = "select * from emaildetails where uid=" + id;
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

	static public ResultSet getProfile(int id) {
		String qry = "select * from profile where regid=" + id;
		Connection con = MakeConnection.getConnection();
		try {
			Statement st = con.createStatement();
			rs = st.executeQuery(qry);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;

	}
}
