package in.hybridsoft.facebook.dao;

import in.hybridsoft.facebook.model.Register;
import in.hybridsoft.facebook.util.MakeConnection;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

public class RegisterDaoImpl implements RegisterDao {
	@Override
	public boolean save(Register register) {

		try {
               // String qry1="insert into emaildetails ()values()";
			String qry = "insert into register(fname,lname,emailid,username,password,mobileno,gender) values('"
					+ register.getFname()
					+ "','"
					+ register.getLname()
					+ "','"
					+ register.getMailid()
					+ "','"
					+ register.getName()
					+ "','"
					+ register.getPassword()
					+ "','"
					+ register.getMob()
					+ "','" + register.getSex() + "')";

			Connection con = MakeConnection.getConnection();
			Statement st = con.createStatement();
			int n = st.executeUpdate(qry);
			System.out.println(n + "------");
			if (n == 1)
				return true;
			else
				return false;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

}
