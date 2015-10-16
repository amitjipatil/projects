package in.hybridsoft.facebook.service;

import in.hybridsoft.facebook.dao.ChangePasswordDao;
import in.hybridsoft.facebook.dao.ChangePasswordDaoImpl;

public class ChangePasswordServiceImpl implements ChangePasswordService {

	@Override
	public boolean changePassword(String newpass, String uname) {
		
		
		return new ChangePasswordDaoImpl().changePassword(newpass,uname);
	}

}
