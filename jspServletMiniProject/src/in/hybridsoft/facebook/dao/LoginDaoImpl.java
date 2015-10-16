package in.hybridsoft.facebook.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import in.hybridsoft.facebook.util.MakeConnection;

public class LoginDaoImpl implements LoginDao {

	@Override
	public boolean validateLogin(String a, String b) {
		// System.out.println(a+" "+b);
		String qry = "select count(*) from register where username='" + a
				+ "' and password='" + b + "'";
		Connection con = MakeConnection.getConnection();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(qry);
			// System.out.println(rs.next());
			while (rs.next()) {
				int i = rs.getInt(1);

				if (i == 0) {
					// System.out.println("----------");
					return false;
				} else {
					// System.out.println("***********");
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
