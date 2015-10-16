package in.hybridsoft.facebook.service;

import in.hybridsoft.facebook.dao.*;
import in.hybridsoft.facebook.model.Register;

import java.util.ArrayList;

public class RegisterServiceImpl implements RegisterService{

	@Override
	public boolean save(Register r) {
        RegisterDao reg=new RegisterDaoImpl();
        boolean bool=reg.save(r);
		return bool;
	}

}
