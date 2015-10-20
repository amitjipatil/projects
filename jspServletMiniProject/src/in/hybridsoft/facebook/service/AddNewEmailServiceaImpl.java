package in.hybridsoft.facebook.service;

import in.hybridsoft.facebook.dao.AddNewEmailDao;
import in.hybridsoft.facebook.dao.AddNewEmailDaoImpl;

public class AddNewEmailServiceaImpl implements AddNewEmailService {

	@Override
	public boolean newEmail(String email, int uid) {
		
		return new AddNewEmailDaoImpl().newEmail(email,uid);
	}

}
