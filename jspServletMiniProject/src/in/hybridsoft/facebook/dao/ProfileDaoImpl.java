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
			regid = profile.getRegid();
			image_url = profile.getImage_url();
			hobby = profile.getHobby();
			intrest = profile.getIntrest();
			address = profile.getAddress();
			pincode = profile.getPincode();
			secondary_email = profile.getSecondary_email();
			/*String qry = "insert into profile(regid,image_url,hobby,intrest,address,pincode,secondary_email) values('"
					+ regid
					+ "','"
					+ image_url
					+ "','"
					+ hobby
					+ "','"
					+ intrest
					+ "','"
					+ address
					+ "','"
					+ pincode
					+ "','"
					+ secondary_email + "')on duplicate key update image_url=values("+image_url+")";
			*/
			String qry = "insert into profile(regid,image_url,hobby,intrest,address,pincode,secondary_email) values('"
					+ profile.getRegid()
					+ "','"
					+ image_url
					+ "','"
					+ hobby
					+ "','"
					+ intrest
					+ "','"
					+ address
					+ "','"
					+ pincode
					+ "','"
					+ secondary_email + "')";
			
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