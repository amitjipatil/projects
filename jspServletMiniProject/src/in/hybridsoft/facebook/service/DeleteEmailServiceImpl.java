package in.hybridsoft.facebook.service;

import in.hybridsoft.facebook.dao.DeleteEmailDao;
import in.hybridsoft.facebook.dao.DeleteEmailDaoImpl;

public class DeleteEmailServiceImpl implements DeleteEmailService{

	public Boolean deleteEmail(int id) {
		
		return new DeleteEmailDaoImpl().deleteEmail(id);
	}

}
