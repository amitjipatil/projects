package in.hybridsoft.facebook.service;

import in.hybridsoft.facebook.dao.ProfileDao;
import in.hybridsoft.facebook.dao.ProfileDaoImpl;
import in.hybridsoft.facebook.model.Profile;

public class ProfileServiceImpl implements ProfileService {

	@Override
	public boolean save(Profile profile) {
       ProfileDao pd= new ProfileDaoImpl();
    boolean bool= pd.save(profile);
		return bool;
	}
 
}
