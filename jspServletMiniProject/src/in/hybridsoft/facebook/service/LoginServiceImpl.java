package in.hybridsoft.facebook.service;
import java.io.IOException;
import java.sql.SQLException;

import in.hybridsoft.facebook.dao.*;
public class LoginServiceImpl implements LoginService{

	@Override
	public boolean validateLogin(String a, String b){
	      //LoginDaoImpl loginDaoImpl=;
	  //  boolean bool= 
	    
	    //System.out.println(bool+"b");
		return  new LoginDaoImpl().validateLogin(a, b);
	} 

	
}
