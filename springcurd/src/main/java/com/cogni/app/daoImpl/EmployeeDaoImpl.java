package com.cogni.app.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.cogni.app.dao.EmployeeDao;
import com.cogni.app.model.Employee;
import com.cogni.app.util.GetConnection;

public class EmployeeDaoImpl implements EmployeeDao {

	public List getData() {
	   Session ses=GetConnection.getSession();
	   //ses.get(Employee.class, pageIndex);
	   Criteria cr=ses.createCriteria(Employee.class);
	   List list=cr.list();
	   return list;
	}

}
