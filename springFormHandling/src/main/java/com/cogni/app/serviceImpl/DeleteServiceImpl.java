package com.cogni.app.serviceImpl;

import javax.annotation.Resource;

import com.cogni.app.dao.DeleteDao;
import com.cogni.app.dao.RegisterDao;
import com.cogni.app.daoImpl.DeleteDaoImpl;
import com.cogni.app.daoImpl.RegisterDaoImpl;
import com.cogni.app.service.DeleteService;

public class DeleteServiceImpl implements DeleteService {
	@Resource
	DeleteDao deleteDao;
	@Override
	public void deleteStudent(int id) {
		//DeleteDao deleteDao=new DeleteDaoImpl();
		//=new RegisterDaoImpl();
		//registerDao.deleteStudent(id);
		deleteDao.deleteStudent(id);
	}

}
