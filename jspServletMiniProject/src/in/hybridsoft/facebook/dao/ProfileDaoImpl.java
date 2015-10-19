package in.hybridsoft.facebook.dao;

import java.sql.Connection;
import java.sql.Statement;

import in.hybridsoft.facebook.model.Profile;
import in.hybridsoft.facebook.util.MakeConnection;

public class ProfileDaoImpl implements ProfileDao {

	private int regid;
	private String image_url;
	private String hobby;
	private String intrest;
	private String address;
	private int pincode;
	private String secondary_email;

	@Override
	public boolean save(Profile profile) {
		try {
			
			
			String qry = "insert into profile(regid,image_url,hobby,intrest,address,pincode,secondary_email) values('"
					+ profile.getRegid()
					+ "','"
					+ profile.getImage_url()
					+ "','"
					+ profile.getHobby()
					+ "','"
					+ profile.getIntrest()
					+ "','"
					+ profile.getAddress()
					+ "','"
					+ profile.getPincode()
					+ "','"
					+ profile.getSecondary_email() + "')";
			
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