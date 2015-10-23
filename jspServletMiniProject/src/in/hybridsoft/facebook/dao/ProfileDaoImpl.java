package in.hybridsoft.facebook.dao;

import java.sql.Connection;
import java.sql.Statement;

import in.hybridsoft.facebook.model.Profile;
import in.hybridsoft.facebook.util.MakeConnection;

public class ProfileDaoImpl implements ProfileDao {

	@Override
	public boolean save(Profile profile) {
		try {
			int regidd=profile.getRegid();
			System.out.println(regidd+"=regidd----");
			
			
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
			int m=0;
			System.out.println(n + "---nn---");
			for(int i=0;i<profile.getMyarr().length;i++)
			{
			String qry1="insert into profile_education values ("+profile.getRegid()+","+profile.getMyarr()[i]+")";
			m=st.executeUpdate(qry1);
			}
	
			
			System.out.println(m + "--mm----");
			if (n == 1 && m==1)
				return true;
			else
				return false;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}

}