package com.cogni.app.serviceImpl;

import java.util.List;

import com.cogni.app.dao.EmployeeDao;
import com.cogni.app.daoImpl.EmployeeDaoImpl;
import com.cogni.app.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	public List getData() {
		EmployeeDao employeeDao=new EmployeeDaoImpl();
		List l=employeeDao.getData();
		return l;
	}

}
